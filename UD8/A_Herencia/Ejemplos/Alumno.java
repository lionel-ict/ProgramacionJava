package UD8.Ejemplos;

public class Alumno extends Persona {
    
    protected String grupo;
    protected double notaMedia;

    public Alumno(String n, String a, String f, String g, double nm) {
        super(n,a,f);
        grupo = g;
        notaMedia = nm;
    }

    public String toString() {
        return super.toString() + " " + grupo + " " + notaMedia;
    }

    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public double getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    


}
