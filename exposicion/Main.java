class Memento {
    private String estado;
    public Memento(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
}

//Esta clase se encarga de guardar el texto escrito en ese momento.

//El estado está guardado de forma privada.

//Solo se puede leer usando getEstado().



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


//Con escribir(), se agrega nuevo texto.

//Con guardar(), se crea un memento con el texto actual.

//Con restaurar(), se vuelve a un estado anterior.



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
}


//Esta clase guarda los estados anteriores del editor.

//Usa una pila (stack) para poder deshacer en orden.

//guardarEstado() guarda un nuevo estado.

//deshacer() saca el último estado guardado y lo devuelve para restaurarlo.


public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        editor.escribir("Hola");
        historial.guardarEstado(editor.guardar());

        editor.escribir("mundo");
        historial.guardarEstado(editor.guardar());

        editor.escribir("esto es una prueba");

        System.out.println("Texto actual: " + editor.getTexto());

        editor.restaurar(historial.deshacer());
        System.out.println("Después de deshacer: " + editor.getTexto());

        editor.restaurar(historial.deshacer());
        System.out.println("Otro deshacer: " + editor.getTexto());
    }
}




//“El patrón Memento es como guardar una partida en un juego: si algo sale mal, 
//puedes volver atrás sin perder todo lo que hiciste.”
