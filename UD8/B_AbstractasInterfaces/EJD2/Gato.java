package UD8.B_AbstractasInterfaces.EJD2;

public class Gato extends Mascota {

    private String color;

    public Gato(String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nombre + " Edad: " + edad + " Color: " + color;
    }

    @Override
    public void habla() {
        System.out.println("Miau Miau");
    }
    
}
