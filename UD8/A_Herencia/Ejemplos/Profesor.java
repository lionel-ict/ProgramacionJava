package UD8.Ejemplos;

public class Profesor extends Persona {
    
    protected double salario;
    protected String especialidad;
    public double getSalario() {
        return salario;
    }

    public Profesor(String n, String a, String f, double s, String e) {
        super(n,a,f);
        salario = s;
        especialidad = e;
    }

    public String toString() {
        return super.toString() + " " + salario + " " + especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    


}
