
package pkg6.excepciones;

import javax.swing.JOptionPane;

public class EXCEPCIONES {

    public static void main(String[] args) {
        
        int x,y;
        
        try {
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicito datos", 3));
    }catch (NumberFormatException n){
        
        System.out.println (n.getMessage() + " NO ES UN NUMERO ENTERO");
    }
        
    }
    
}

