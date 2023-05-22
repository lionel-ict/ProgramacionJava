package UD6;

public class Main2 {
    public static void main(String[] args) {
        try {
            Articulo2 a = new Articulo2("Pantalón azul", -25, 10);
            System.out.println(a);
        }
        catch (Exception e) {
            System.out.println("No se ha podido crear el objeto");
        }
        
    }
}