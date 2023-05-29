package UD8.B_AbstractasInterfaces.EJD2;

import java.util.ArrayList;

public class ProgramaMascotas {

    public static void main(String[] args) {

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(new Perro("Pancho", 3, false));
        mascotas.add(new Perro("Pulgas", 3, true));
        mascotas.add(new Gato("Giskis", 6, "blanco"));
        mascotas.add(new Gato("Gaskas", 6, "negro"));
        mascotas.add(new Canario("Cuco", 0, false));
        mascotas.add(new Canario("Caco", 0, true));

        mostrarMascotas(mascotas);

        for (Mascota m : mascotas)
            for (int i = 1; i <= 5; i++)
                m.cumpleaños();

        mostrarMascotas(mascotas);

        for (Mascota m : mascotas)
                m.habla();
        
    }

    public static void mostrarMascotas(ArrayList<Mascota> mascotas){
        System.out.println("===MASCOTAS===");
        for (Mascota m : mascotas)
            System.out.println(m);
    }

}
