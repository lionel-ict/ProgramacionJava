package UD6;

import java.util.ArrayList;

public class UD6Ej1 {

    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        imprimirAL(colores);
        
        colores.add(2,"Negro");
        colores.add(1,"Cyan");

        imprimirAL(colores);

        colores.remove(1);

        imprimirAL(colores);

        colores.clear();

        imprimirAL(colores);

    }

    public static void imprimirAL(ArrayList<String> al) {
        System.out.println("LISTA");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Posicion : " + i + " Item: " + al.get(i));
        }
    }

}