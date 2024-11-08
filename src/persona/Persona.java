package persona;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(){
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void Saludo(){
        System.out.println("¡Bienvenido, " + this.getNombre() + " " + this.getApellido() + "!");
    }
}
