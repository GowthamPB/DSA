package com.dsa.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        Summation(number1, number2);
    }

    static void Summation(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
