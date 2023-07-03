
package pkg15.ioexeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEXEPTION {

    public static void main(String[] args) {
       

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Ingrese el primer numero: ");
            String number1Input = reader.readLine();
            int number1 = Integer.parseInt(number1Input);

            System.out.print("Ingrese el segundo numero: ");
            String number2Input = reader.readLine();
            int number2 = Integer.parseInt(number2Input);

            int sum = number1 + number2;
            System.out.println("La suma es: " + sum);
        } catch (IOException e) {
            System.out.println("Se produjo una excepcion IOException");
            System.out.println("Mensaje de error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Se produjo un error al convertir los numeros");
            System.out.println("Mensaje de error: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el lector de entrada.");
            }
        }
    }
}

    
