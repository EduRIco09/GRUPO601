
package pkg10.excepciones5;


public class EXCEPCIONES5 {

    
    public static int miMetodo(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();
        }
        
        int c =a/b;
        return c;
    }
    
    public static void main(String[] args) {
    
         try {
            int division=miMetodo(10,0);
            System.out.println(division);
        }catch (ArithmeticException e){
            System.out.println("EXCEPCION ARITMETICA ARROJADA: ");
            e.printStackTrace();
        }
        
        
    }
    
}
