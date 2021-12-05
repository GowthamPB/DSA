package com.dsa.functions;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int max = maximum(num1, num2, num3);
        int min = minimum(num1, num2, num3);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }

    static int minimum(int a, int b, int c) {
        int min = a;
        if (b < a) {
            min = b;
        } else if (c < a) {
            min = c;
        }
        return min;
    }

    static int maximum(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }
        return max;
    }
}
