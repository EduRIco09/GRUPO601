
package pkg9.excepciones4;


public class EXCEPCIONES4 {

    
    public static void main(String[] args) {
        
        try {
            int division=miMetodo(10,0);
            System.out.println(division);
        }catch (ArithmeticException e){
            System.out.println("EXCEPCION ARITMETICA ARROJADA");
        }
        
    }
    
    public static int miMetodo(int a , int b) throws ArithmeticException{
        int c = a/b;
        return c;
    
    }
    
}
