package com.dsa.functions;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        PythagorasWouldBeProud(number1, number2, number3);
    }

    static void PythagorasWouldBeProud(int num1, int num2, int num3) {
        if ((num1 * num1) + (num2 * num2) == (num3 * num3)) {
            System.out.println("They are pythagorean triplets");
        } else {
            System.out.println("They are not Pythagorean triplets");
        }
    }
}
