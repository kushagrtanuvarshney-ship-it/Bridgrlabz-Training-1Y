package com.gla.gla.methods;

public class Circle {
    public void areaOfCircle(int radius) {
        System.out.println("Area of circle:");
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    public void circumferenceOfCircle(int radius) {
        System.out.println("Circumference of circle:");
        double circum = 2 * Math.PI * radius;
        System.out.println(circum);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.areaOfCircle(10);
        c.circumferenceOfCircle(20);
    }
}