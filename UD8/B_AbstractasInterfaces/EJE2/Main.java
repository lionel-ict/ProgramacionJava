package UD8.B_AbstractasInterfaces.EJE2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Escena2D escena = new Escena2D(30, 30);
        escena.fill('·');

        ArrayList<IDrawable> figuras = new ArrayList();
        figuras.add(new Rectangulo(5,5,5,5));
        figuras.add(new Rectangulo(20,5,5,5));
        figuras.add(new Rectangulo(13,13,4,4));
        figuras.add(new Rectangulo(5,20,20,5));

        escena.draw(figuras, 'X');
        escena.print();

    }
}
