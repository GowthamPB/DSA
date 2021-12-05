package com.dsa.functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        EvenOdd(number);
    }

    static void EvenOdd(int number) {
        if (number % 2 == 0) System.out.println("The number is even");
        else System.out.println("The number is odd");
    }
}
