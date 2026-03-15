package com.gla.Polymorphism;

public class Runner_Calculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int sum1 = c1.add(2,3);
        System.out.println("Sum of Integer"+sum1);
        double sum2 = c1.add(11.22,22.23);
        System.out.println("sum of double"+sum2);
    }

}
