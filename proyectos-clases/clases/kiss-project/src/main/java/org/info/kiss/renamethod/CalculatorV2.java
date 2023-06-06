package org.info.kiss.renamethod;

public class CalculatorV2 {

    // Antes del refactoring
    public int calculate(int number1, int number2){
        int result = 0;

        if (number1 > 0 && number2 > 0) {
            result = number1 + number2;
            System.out.println("La suma es: " + result);
        } else if (number1 < 0 && number2 < 0) {
            result = number1 * number2;
            System.out.println("La multiplicación es: " + result);
        } else {
            System.out.println("No se puede realizar ninguna operación");
        }

        return result;
    }

    // Después del refactoring

}
