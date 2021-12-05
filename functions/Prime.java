package com.dsa.functions;

import java.util.Scanner;
import java.lang.*;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        isPrime(number);
    }

    public static void isPrime(int num) {
        if (num <= 1) {
            System.out.println("The number is not a prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println("The number is not a prime");
                    System.exit(0);
                }
            }
            System.out.println("The number is prime");
        }

    }
}

