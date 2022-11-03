package practica1;

import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingresa dos numeros: \n");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        try {
        int result = value1/value2;
        System.out.println("el resultado es: " + result);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println();
        }



    }
}
