
package pkg13.classnotfoundexeption;

public class CLASSNOTFOUNDEXEPTION {

    public static void main(String[] args) {
        
        try {
            // Intentamos cargar una clase inexistente
            Class<?> mathClass = Class.forName("com.example.MathOperations");
            System.out.println("Clase cargada exitosamente: " + mathClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Se produjo una excepcion ClassNotFoundException");
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}

    
    

