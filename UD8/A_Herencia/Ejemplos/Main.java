package UD8.A_Herencia.Ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Persona> personas = new ArrayList();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        Persona pe1 = new Persona("Raquel", "Luján", "13/10/85");
        System.out.println(pe1);

        Alumno a1 = new Alumno("Raúl", "Olmedo", "14/12/2004", "1DAM", 7);
        System.out.println(a1);

        Profesor pr1 = new Profesor("Lionel", "Apellidos", "8/2/83", 786.0, "Informática");
        System.out.println(pr1);
        
    }

    public static void añadirPersona(){
        System.out.println("Dime nombre, apellido y fecha: ");
        String n = in.nextLine();
        String a = in.nextLine();
        String f = in.nextLine();
        Persona per = new Persona(n,a,f);
        personas.add(per);
    }

    public static void añadirAlumno(){
        System.out.println("Dime nombre, apellido, fecha, grupo, notaMedia: ");
        String n = in.nextLine();
        String a = in.nextLine();
        String f = in.nextLine();
        String g = in.nextLine();
        double nm = in.nextDouble();
        in.nextLine();
        Alumno alu = new Alumno(n,a,f,g,nm);
        personas.add(alu);
    }

}
