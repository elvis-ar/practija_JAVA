package practica1;

/*Crea un array bidimensional de enteros y recórrelo,
 mostrando la posición y el valor de cada elemento en
 ambas dimensiones.*/

public class Ejer2 {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4,5}, {6,7,8,9,10}};


        for (int[] number : numbers) {
            for (int i : number) {
                System.out.println(i);
            }
        }
    }
}
