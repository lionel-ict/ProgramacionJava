package Pruebas;

import java.util.ArrayList;

public class HolaMundo {

    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(125);
        l1.add(30);
        ArrayList<Integer> l2 = new ArrayList();
        l2.add(100);
        l2.add(200);
        l2.add(300);

        int tmp = l1.get(2);
        l1.remove(2);
        l2.add(tmp);

        System.out.println(l1);
        System.out.println(l2);

    }

}