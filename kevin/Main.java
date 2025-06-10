import java.time.LocalDate;

public class Main {
      public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("978-1234567890", "Java Básico", "Juan Pérez", "Programación", "2022");
        System.out.println(biblioteca.registrarLibro(libro1));

        Lector lector1 = new Lector("C123", "Ana", "Gómez", "ana@example.com");
        System.out.println(biblioteca.registrarLector(lector1));

        Prestamo prestamo1 = new Prestamo("P001", libro1, lector1,
                LocalDate.of(2025,6,1), LocalDate.of(2025,6,15));
        System.out.println(biblioteca.registrarPrestamo(prestamo1));

        System.out.println("Libros registrados:");
        biblioteca.listarLibros().forEach(System.out::println);

        System.out.println("Filtrado por título 'Java':");
        biblioteca.filtrarLibroPorTitulo("Java").forEach(System.out::println);

        System.out.println("Buscar libro por ISBN:");
        System.out.println(biblioteca.buscarLibroPorId("978-1234567890"));

        System.out.println("Préstamos activos:");
        biblioteca.listarPrestamos().forEach(System.out::println);

        System.out.println(biblioteca.devolverLibro("P001"));
        System.out.println("Préstamos tras devolución:");
        biblioteca.listarPrestamos().forEach(System.out::println);
    }
}
