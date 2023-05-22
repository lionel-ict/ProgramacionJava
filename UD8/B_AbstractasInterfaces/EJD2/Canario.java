package UD8.B_AbstractasInterfaces.EJD2;

public class Canario extends Mascota {

    private boolean volando;

    public Canario(String nombre, int edad, boolean volando){
        this.nombre = nombre;
        this.edad = edad;
        this.volando = volando;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nombre + " Edad: " + edad + " Volando: " + ((volando)? "Sí" : "No");
    }

    @Override
    public void habla() {
        System.out.println("Pio Pio");
    }

    @Override
    public void cumpleaños() {
        edad += 2;
    }
    
}
