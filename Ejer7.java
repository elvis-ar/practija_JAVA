package practica1;

/*Crea una función DividePorCero. Esta, debe generar una excepción
 ("throws") a su llamante del tipo ArithmeticException que será
 capturada por su llamante (desde "main", por ejemplo).
 Si se dispara la excepción, mostraremos el mensaje "Esto no
 puede hacerse". Finalmente, mostraremos en cualquier caso:
 "Demo de código".*/

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa dos numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            dividePorCero(num1,num2);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Esto no se puede hacer");
        }finally {
            System.out.println("Demo de coodigo");
        }

    }

    public static void dividePorCero(int num1, int num2) throws ArithmeticException{

        try {
            int result = num1 / num2;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }

    }
}
