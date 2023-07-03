
package pkg14.nullpointerexeption;

public class NULLPOINTEREXEPTION {

    public static void main(String[] args) {
      
        try {
            Integer number1 = null;
            int number2 = 5;
            int sum = number1 + number2;
            System.out.println("La suma es: " + sum);
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepcion NullPointerException");
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}
