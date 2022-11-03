package practica1;

public class GenerarErrores {

    public static void main(String[] args) {
        try {
            System.out.println(divide(4,0));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int resultado;
        try {
            resultado = a/b;
        }catch (Exception e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}
