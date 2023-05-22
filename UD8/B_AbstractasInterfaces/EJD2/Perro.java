package UD8.B_AbstractasInterfaces.EJD2;

public class Perro extends Mascota {

    private boolean pulgas;

    public Perro(String nombre, int edad, boolean pulgas){
        this.nombre = nombre;
        this.edad = edad;
        this.pulgas = pulgas;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nombre + " Edad: " + edad + " Pulgas: " + ((pulgas)? "Sí" : "No");
    }

    @Override
    public void habla() {
        System.out.println("Guau Guau");
    }
    
}
