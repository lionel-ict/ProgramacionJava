package UD8.B_AbstractasInterfaces.EJD2;

public abstract class Mascota {
    
    protected String nombre;
    protected int edad;

    public abstract String toString();
    public abstract void habla();

    public void cumpleaños(){
        edad++;
    }
}
