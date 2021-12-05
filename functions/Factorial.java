package com.dsa.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        fact(num);
    }

    static void fact(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + " is " + factorial);
    }
}
