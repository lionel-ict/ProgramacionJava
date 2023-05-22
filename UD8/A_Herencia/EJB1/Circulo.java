package UD8.A_Herencia.EJB1;

public class Circulo extends Figura {
    
    double radio;

    public Circulo(double radio) throws Exception {
        if (radio <= 0 )
            throw new Exception("El radio no puede ser <= 0");
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }

}
