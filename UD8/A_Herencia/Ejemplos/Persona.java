package UD8.A_Herencia.Ejemplos;

public class Persona {

    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;

    public Persona(String n, String a, String f) {
        nombre = n;
        apellidos = a;
        fechaNacim = f;
    }

    public Persona(){
        
    }

    public String toString() {
        return this.getClass().getSimpleName() + " " + nombre + " " + apellidos + " " + fechaNacim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    

}
