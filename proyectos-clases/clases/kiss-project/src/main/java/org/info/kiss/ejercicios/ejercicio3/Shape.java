package org.info.kiss.ejercicios.ejercicio3;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public void draw() {
        if (type.equals("circle")) {
            System.out.println("Drawing a circle");
        } else if (type.equals("rectangle")) {
            System.out.println("Drawing a rectangle");
        } else if (type.equals("triangle")) {
            System.out.println("Drawing a triangle");
        } else {
            System.out.println("Unknown shape");
        }
    }
}