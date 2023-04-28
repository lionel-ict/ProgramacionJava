package UD6;

public class MainArticulos {
    
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("TV", 300.0, 21, 10);
        Articulo a2 = new Articulo("Zapas", 30.0, 21, 5);
        Articulo a3 = new Articulo("Camiseta", 20.0, 21, 100);

        System.out.println(a1);
        //System.out.println(a2);
        //System.out.println(a3);

        a1.vender(5);

        System.out.println(a1);

        a1.vender(7);

        System.out.println(a1);

    }

}
