package practica1;

import java.util.Scanner;

/*Escribe el código que devuelva una cadena al revés.
Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".*/

public class Reverse {
    public static void main(String[] args) {

        String text = getData();
        String reverseText = reverse(text);

        System.out.println("la cadena origninal es: " + text);
        System.out.println("la cadena al revez es: " + reverseText);

    }

    public static String reverse(String text) {
        int sizeText = text.length() - 1;
        StringBuilder reverseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            reverseText.append(text.charAt(sizeText));
            sizeText--;

        }
        return reverseText.toString();
    }

    public static String getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una plabra");
        return scanner.nextLine();
    }
}
