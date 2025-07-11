import java.util.Scanner;

class EJEMPLO {
    private String estado;
    
    public EJEMPLO(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }
}

// Esta clase se encarga de guardar el texto escrito en ese momento.
// El estado está guardado de forma privada.
// Solo se puede leer usando getEstado().

class EditorTexto {
    private String texto = "";

    public void escribir(String nuevoTexto) {
        texto += nuevoTexto + " ";
    }

    public String getTexto() {
        return texto;
    }

    public Memento guardar() {
        return new Memento(texto);
    }

    public void restaurar(Memento memento) {
        texto = memento.getEstado();
    }
}

// Con escribir(), se agrega nuevo texto.
// Con guardar(), se crea un memento con el texto actual.
// Con restaurar(), se vuelve a un estado anterior.

class Historial {
    private java.util.Stack<Memento> historial = new java.util.Stack<>();

    public void guardarEstado(Memento m) {
        historial.push(m);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
    
    public boolean tieneHistorial() {
        return !historial.isEmpty();
    }
}

// Esta clase guarda los estados anteriores del editor.
// Usa una pila (stack) para poder deshacer en orden.
// "El Stack es como una pila de cosas: lo último que pusiste es lo primero que puedes sacar."
// guardarEstado() guarda un nuevo estado.
// deshacer() saca el último estado guardado y lo devuelve para restaurarlo.

public class Main1 {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("  PATRÓN MEMENTO ");
        
        System.out.println("1 - Escribir texto");
        System.out.println("2 - Guardar estado");
        System.out.println("3 - Deshacer");
        System.out.println("4 - Ver texto actual");
        System.out.println("5 - Salir");
        
        
        while (true) {
            System.out.println("\nTexto actual: \"" + editor.getTexto().trim() + "\"");
            System.out.print("Selecciona una opción (1-5): ");
            
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                switch (opcion) {
                    case 1:
                        System.out.print("Escribe el texto que quieres agregar: ");
                        String nuevoTexto = scanner.nextLine();
                        editor.escribir(nuevoTexto);
                        System.out.println(" Texto agregado");
                        break;
                        
                    case 2:
                        historial.guardarEstado(editor.guardar());
                        System.out.println(" Estado guardado en el historial");
                        break;
                        
                    case 3:
                        if (historial.tieneHistorial()) {
                            Memento estadoAnterior = historial.deshacer();
                            editor.restaurar(estadoAnterior);
                            System.out.println(" Estado restaurado");
                        } else {
                            System.out.println(" No hay estados guardados para deshacer");
                        }
                        break;
                        
                    case 4:
                        System.out.println("Texto completo: \"" + editor.getTexto().trim() + "\"");
                        break;
                        
                    case 5:
                        System.out.println("Gracias");
                        scanner.close();
                        return;
                        
                    default:
                        System.out.println(" Opción no válida. Selecciona entre 1 y 5");
                }
                
            } catch (Exception e) {
                System.out.println(" Por favor ingresa un número válido");
                scanner.nextLine(); // Limpiar buffer en caso de error
            }
        }
    }
}