package UD8.B_AbstractasInterfaces.EJD1;

public class Cuadrado extends Figura {

    double lado;

    public Cuadrado(double lado) throws Exception {
        if (lado <= 0 )
            throw new Exception("El lado no puede ser <= 0");
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }

}
