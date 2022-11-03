package practica1;

/*Crea un ArrayList de tipo int, y, utilizando un
bucle rellénalo con elementos 1..10. A continuación,
con otro bucle, recórrelo y elimina los numeros pares.
Por último, vuelve a recorrerlo y muestra el ArrayList final.
Si te atreves, puedes hacerlo en menos pasos, siempre
y cuando cumplas el primer "for" de relleno.*/

import java.util.ArrayList;

public class Ejer6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i+1);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                numbers.remove(i);
            }
        }

        for (int i: numbers) {
            System.out.println(i);
        }

    }
}
