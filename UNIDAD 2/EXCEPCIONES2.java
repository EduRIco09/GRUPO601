
package pkg7.excepciones2;

import javax.swing.JOptionPane;

public class EXCEPCIONES2 {

    
    public static void main(String[] args) {
         
        int x,y;
        
        try {
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicito datos", 3));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 2:", "Solicito datos", 3));
        JOptionPane.showMessageDialog(null, "LA DIVISION DE " +x+ " ENTRE " +y+ " ES " +(x/y)," MOSTRANDO EL RESULTADO", 1);
        
        }catch (NumberFormatException n){
        
        System.out.println (n.getMessage() + " NO ES UN NUMERO ENTERO");
    }catch (ArithmeticException a){
        System.out.println (a.getMessage() + " NO SE PUEDE DIVIR ENTRE 0");
    }
        
    }
    
}
