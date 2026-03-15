package com.gla.Abstraction;
public class Runner
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.position();
        s1.info();
        System.out.println("----------------------------------------------");
        Teacher t1 = new Student();
        t1.info();
        t1.position();
    }
}