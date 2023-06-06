package org.info.kiss.extractmethod;

public class Calculator {

    // Antes del refactoring
    public int performCalculation(int x, int y){

        if (x > 0 && y > 0) {
            return performSum(x,y);
        } else if (x < 0 && y < 0) {
            return performMultiplication(x,y);
        }
        System.out.println("No se puede realizar ninguna operación");
        return 0;
    }

    // Después del refactoring
    private int performSum(int x,int y){
        int result = x + y;
        System.out.println("La suma es: " + result);
        return result;
    }

    private int performMultiplication(int x,int y){
        int result = x * y;
        System.out.println("La multiplicación es: " + result);
        return result;
    }


}
