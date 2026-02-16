package com.gla.gla.methods;

public class Rectangle {
    public void areaOfRectangle(int len,int wid) {
        System.out.println("Area of Rectangle:");
        double area = len*wid;
        System.out.println(area);
    }

    public void perimeterofRectangle(int len,int wid) {
        System.out.println("Circumference of Rectangle:");
        double peri =2*(len+wid) ;
        System.out.println(peri);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.areaOfRectangle(20,10);
        r.perimeterofRectangle(20,10);
    }
}