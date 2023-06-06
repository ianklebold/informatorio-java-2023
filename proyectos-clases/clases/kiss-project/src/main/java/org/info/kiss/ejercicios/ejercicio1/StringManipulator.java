package org.info.kiss.ejercicios.ejercicio1;

public class StringManipulator {
    public static void main(String[] args) {
        // Antes del refactoring

        String name = "John Doe";
        int age = 30;
        String occupation = "Engineer";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);

        String modifiedName = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
                modifiedName += Character.toLowerCase(c);
            } else {
                modifiedName += Character.toUpperCase(c);
            }
        }

        System.out.println("Modified Name: " + modifiedName);
    }
}
