package practica1;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("elvis");
        names.add("liz");
        names.add("benja");
        names.add("emma");

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("-----------------");

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*2;
        }

        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
