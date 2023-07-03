
package pkg16.filenotfoundexeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FILENOTFOUNDEXEPTION {

    public static void main(String[] args) {
       


        try {
            File inputFile = new File("numeros.txt");
            Scanner scanner = new Scanner(inputFile);

            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            int sum = number1 + number2;
            System.out.println("La suma es: " + sum);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Se produjo una excepcion FileNotFoundException");
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}

    
    

