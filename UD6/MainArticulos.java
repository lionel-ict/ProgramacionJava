package UD6;

import java.util.ArrayList;

public class MainArticulos {
    
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("TV", 300.0, 10);
        Articulo a2 = new Articulo("Zapas", 30.0, 5);
        Articulo a3 = new Articulo("Camiseta", 20.0, 100);

        ArrayList<Articulo> al = new ArrayList<Articulo>();

        al.add(a1);
        al.add(a2);
        al.add(a3);

        for (int i = 0; i < al.size(); i++) {
            Articulo a = al.get(i);
            if (a.getNombre().contains("Tele"))
                System.out.println(a);
            
        }


        /* 
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        a3.setIva(30);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        Articulo.iva = 100;
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        */

        //System.out.println(a1);

        //System.out.println(a2);
        //System.out.println(a3);

        //a1.vender(5);
        //System.out.println(a1);
        //a1.vender(7);
        //System.out.println(a1);

        



    }

}
