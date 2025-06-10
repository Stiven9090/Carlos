public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private String fechaPublicacion;

    public Libro(String isbn, String titulo, String autor, String genero, String fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getGenero() { return genero; }
    public String getFechaPublicacion() { return fechaPublicacion; }

    // Método para mostrar info del libro
    @Override
    public String toString() {
        return "Libro [ISBN=" + isbn + ", Titulo=" + titulo + ", Autor=" + autor +
               ", Genero=" + genero + ", FechaPublicacion=" + fechaPublicacion + "]";
    }
}