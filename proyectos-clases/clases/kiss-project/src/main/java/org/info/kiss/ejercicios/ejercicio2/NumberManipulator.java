package org.info.kiss.ejercicios.ejercicio2;

public class NumberManipulator {
    public static void main(String[] args) {
        // Antes del refactoring
        int number = 12345;

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
