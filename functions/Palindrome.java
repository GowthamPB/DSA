package com.dsa.functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        reverse(number);
    }

    static void reverse(int number) {
        int num = number;
        int rev = 0, temp;
        while (number > 0) {
            temp = number % 10;
            rev = rev * 10 + temp;
            number = number / 10;
        }
        if (rev == num) {
            System.out.println("THe number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }
}
