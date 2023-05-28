package UD8.B_AbstractasInterfaces.EJE2;

import java.util.ArrayList;

public class Escena2D {
    private char[][] escena;

    public Escena2D(int filas, int columnas){
        escena = new char[filas][columnas];
    }

    public char[][] getEscena() {
        return escena;
    }

    public void setEscena(char[][] escena) {
        this.escena = escena;
    }

    public int getFilas(){
        return escena.length;
    }

    public int getColumnas(){
        return escena[0].length;
    }

    public void fill(char c){
        for (int i = 0; i < escena.length; i++) {
            for (int j = 0; j < escena[i].length; j++) {
                escena[i][j] = c;
            }
        }
    }

    public void clear(){
        fill(' ');
    }

    public void draw(ArrayList<IDrawable> figuras, char c){
        for(IDrawable f : figuras)
            f.draw(escena, c);
    }

    public void draw(IDrawable figura, char c){
        figura.draw(escena, c);
 }

    public void print(){
        for (int i = 0; i < escena.length; i++) {
            for (int j = 0; j < escena[i].length; j++) {
                System.out.print(escena[i][j] + " ");
            }
            System.out.println();
        }
    }

}
