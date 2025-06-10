
import java.time.LocalDate;

public class Prestamo {
    private String id; // Identificador único del préstamo
    private Libro libro;
    private Lector lector;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean devuelto;

    public Prestamo(String id, Libro libro, Lector lector, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.id = id;
        this.libro = libro;
        this.lector = lector;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = false;
    }

    // Getters
    public String getId() { return id; }
    public Libro getLibro() { return libro; }
    public Lector getLector() { return lector; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public boolean isDevuelto() { return devuelto; }

    // Método para devolver libro
    public void devolver() {
        this.devuelto = true;
    }

    @Override
    public String toString() {
        return "Prestamo [ID=" + id + ", Libro=" + libro.getTitulo() + ", Lector=" + lector.getNombre() + " " + lector.getApellido() +
               ", FechaPrestamo=" + fechaPrestamo + ", FechaDevolucion=" + fechaDevolucion +
               ", Devuelto=" + devuelto + "]";
    }
}
