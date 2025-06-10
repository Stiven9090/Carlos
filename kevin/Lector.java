public class Lector {
     private String id;       // Carné o Cédula
    private String nombre;
    private String apellido;
    private String correo;

    public Lector(String id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCorreo() { return correo; }

    @Override
    public String toString() {
        return "Lector [ID=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido +
               ", Correo=" + correo + "]";
    }
}
