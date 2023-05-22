package UD7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pruebas2 {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("DIME 5 NOTAS");
        int suma = 0;
        int nota;

        for (int i = 1; i <= 5; i++) {
            nota = pideIntValido("Dime la nota " + i);
            suma += nota;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (suma/5.0));

        System.out.println("SIGUE EJECUTANDOSE EL PROGRAMA");

    }

    public static int pideIntValido(String mensaje) {
        Scanner lector = new Scanner(System.in);
        int valor = 0;
        boolean repetir = true;
        do {
            System.out.println(mensaje);
            try {
                valor = lector.nextInt();
                repetir = false;
            } catch (InputMismatchException e) {
                System.err.println("Aviso: Dato no válido. Introduce un int!!!");
                lector.nextLine();
            }
        } while (repetir);

        return valor;

    }


}
