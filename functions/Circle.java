package com.dsa.functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius = input.nextFloat();
        measurement(radius);
    }

    static void measurement(float rad) {
        float circumference = 2 * 3.14f * rad;
        float area = 2 * rad * rad;
        System.out.println("The circumference of circle is " + circumference);
        System.out.println("THe area of circle is " + area);
    }
}
