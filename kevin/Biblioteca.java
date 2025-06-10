import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Biblioteca {
    private Map<String, Libro> libros = new HashMap<>();
    private Map<String, Lector> lectores = new HashMap<>();
    private Map<String, Prestamo> prestamos = new HashMap<>();

    public String registrarLibro(Libro libro) {
        if (libro == null || libro.getIsbn() == null || libro.getIsbn().isEmpty()) {
            return "Error: ISBN inválido";
        }
        if (libros.containsKey(libro.getIsbn())) {
            return "Error: ISBN repetido";
        }
        libros.put(libro.getIsbn(), libro);
        return "El libro se registró correctamente";
    }

    public String registrarLector(Lector lector) {
        if (lector == null || lector.getId() == null || lector.getId().isEmpty()) {
            return "Error: ID inválido";
        }
        if (lectores.containsKey(lector.getId())) {
            return "Error: Usuario ya registrado";
        }
        lectores.put(lector.getId(), lector);
        return "Lector registrado correctamente";
    }

    public String registrarPrestamo(Prestamo prestamo) {
        if (prestamo == null) {
            return "Error: Datos de préstamo inválidos";
        }
        if (!libros.containsKey(prestamo.getLibro().getIsbn())) {
            return "Error: Libro no registrado";
        }
        if (!lectores.containsKey(prestamo.getLector().getId())) {
            return "Error: Lector no registrado";
        }
        if (prestamo.getFechaPrestamo() == null || prestamo.getFechaDevolucion() == null
                || prestamo.getFechaDevolucion().isBefore(prestamo.getFechaPrestamo())) {
            return "Error: Fechas inválidas";
        }
        if (prestamos.containsKey(prestamo.getId())) {
            return "Error: Préstamo con ID repetido";
        }
        prestamos.put(prestamo.getId(), prestamo);
        return "Préstamo registrado correctamente";
    }

    public List<Libro> listarLibros() {
        return new ArrayList<>(libros.values());
    }

    public List<Libro> filtrarLibroPorTitulo(String titulo) {
        return libros.values().stream()
                .filter(libro -> libro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Libro buscarLibroPorId(String isbn) {
        return libros.get(isbn);
    }

    public List<Lector> listarLectores() {
        return new ArrayList<>(lectores.values());
    }

    public Lector buscarLectorPorId(String id) {
        return lectores.get(id);
    }

    public List<Prestamo> listarPrestamos() {
        return new ArrayList<>(prestamos.values());
    }

    public Prestamo buscarPrestamoPorId(String id) {
        return prestamos.get(id);
    }

    public List<Prestamo> filtrarPrestamos(String usuarioId, String libroIsbn, Boolean devuelto) {
        return prestamos.values().stream()
                .filter(p -> (usuarioId == null || p.getLector().getId().equals(usuarioId)) &&
                             (libroIsbn == null || p.getLibro().getIsbn().equals(libroIsbn)) &&
                             (devuelto == null || p.isDevuelto() == devuelto))
                .collect(Collectors.toList());
    }

    public String devolverLibro(String prestamoId) {
        Prestamo prestamo = prestamos.get(prestamoId);
        if (prestamo == null) {
            return "Error: Préstamo no encontrado";
        }
        if (prestamo.isDevuelto()) {
            return "Error: Libro ya fue devuelto";
        }
        prestamo.devolver();
        return "Devolución registrada correctamente";
    }
}
