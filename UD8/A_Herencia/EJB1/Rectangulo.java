package UD8.A_Herencia.EJB1;

public class Rectangulo extends Figura {

    double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }


    
}
