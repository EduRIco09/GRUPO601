
package pkg8.excepciones3;


public class EXCEPCIONES3 {

    public static void main(String[] args) {
        
        try {
            float equis=5/0;
            System.out.println("EQUIS: "+equis);
        }catch (ArithmeticException a){
            System.out.println("ERROR: DIVISION ENTRE 0");
        }finally {
            System.out.println("APESAR DE TODO SE EJECUTA EL BLOQUE FINALLY");
            
        }
        
    }
    
}
