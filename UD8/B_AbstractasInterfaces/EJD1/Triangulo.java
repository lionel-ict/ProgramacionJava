package UD8.B_AbstractasInterfaces.EJD1;

public class Triangulo extends Figura {
    
    double base;
    double altura;

    public Triangulo(double base, double altura) throws Exception {
        if (base <= 0 || altura <= 0 )
            throw new Exception("Ni la base ni la altura pueden ser <= 0");
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return (base * altura) / 2;
    }

}
