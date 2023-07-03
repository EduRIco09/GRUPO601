
package pkg12.classcastexep;

public class CLASSCASTEXEP {

    public static void main(String[] args) {
      
 
        try {
            // Intentamos realizar una operación matemática con tipos incompatibles
            Object result = performMathOperation("5", 10);
            int intValue = (Integer) result;
            System.out.println("El resultado de la operación es: " + intValue);
        } catch (ClassCastException e) {
            System.out.println("¡Se produjo una excepción ClassCastException!");
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }

    public static Object performMathOperation(Object operand1, Object operand2) {
        if (operand1 instanceof String && operand2 instanceof Integer) {
            String strOperand1 = (String) operand1;
            int intOperand2 = (int) operand2;
            int result = Integer.parseInt(strOperand1) + intOperand2;
            return result;
        } else {
            throw new ClassCastException("Tipos de operandos no compatibles");
        }
    }
}
