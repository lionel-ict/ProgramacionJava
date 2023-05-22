package UD7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pruebas {
    
    public static void main(String[] args) {
        
        try {
            Scanner lector = new Scanner(System.in);
            System.out.print("Valor: ");
            int num = lector.nextInt();
            int res = 100 / num;
            System.out.println(res);
        } catch (InputMismatchException e){
            System.err.println("Dato introducido incorrecto");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println("No se puede dividir por cero");
            e.printStackTrace();
        }

        System.out.println("SIGUE EJECUTANDOSE EL PROGRAMA");

        

    }


}
