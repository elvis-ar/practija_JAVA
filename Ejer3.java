package practica1;

import java.util.Vector;

/*Crea un "Vector" del tipo de dato que prefieras,
y añádele 5 elementos. Elimina el 2o y 3er elemento
y muestra el resultado final.*/

public class Ejer3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(50);
        vector.add(50);

        System.out.println(vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println(vector);
    }
}
