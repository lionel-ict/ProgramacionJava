package UD8.A_Herencia.EJB3;

public class Main {
    
    public static void main(String[] args) {

        CuentaCorriente c1, c2;

        try {
            c1 = new CuentaCorriente("María", 100);
            c2 = new CuentaCorriente("Pepe", 100);

            System.out.println(c1);
            System.out.println(c2);

            c1.ingresar(20);
            c2.ingresar(10);

            System.out.println(c1);
            System.out.println(c2);

            c1.retirar(100);
            c2.retirar(100);

            System.out.println(c1);
            System.out.println(c2);

            c1.setSaldo(100);
            c2.setSaldo(100);

            System.out.println(c1);
            System.out.println(c2);

            c1.actualizarMensualidad();
            c2.actualizarMensualidad();

            System.out.println(c1);
            System.out.println(c2);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
