import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SuperficieCuadrado {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        getSurfaceSquare(numbers);

        System.out.println( Math.pow( numbers.get(0), 2) );

    }

    static public void getSurfaceSquare(List<Integer> value){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado");
        value.add(scanner.nextInt());
    }
}
