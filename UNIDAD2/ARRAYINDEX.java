
package pkg11.arrayindex;

public class ARRAYINDEX {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Accediendo a un índice fuera de los límites del arreglo
            int value = numbers[10];
            System.out.println("El valor en la posición 10 es: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepcion ArrayIndexOutOfBoundsException");
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}
    
    
