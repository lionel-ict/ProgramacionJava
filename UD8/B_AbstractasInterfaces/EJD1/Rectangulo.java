package UD8.B_AbstractasInterfaces.EJD1;

public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }
    
}
