package practica1;

/*Indica cuál es el problema de utilizar un Vector con la
capacidad por defecto si tuviésemos 1000 elementos para
ser añadidos al mismo.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ejer5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("pepito", "juancito", "jaimito", "lupe"));
        //copiando directamente en el constructor
        LinkedList<String> copyNames = new LinkedList<>(names);

        // dos formas distintas de copiar

        /*
        for (String name : names) {
            copyNames.add(name);
         }
         */

        // copyNames.addAll(names);

        System.out.println(names);
        System.out.println("---------------------");
        System.out.println(copyNames);
    }
}
