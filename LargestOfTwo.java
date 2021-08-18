//Take 2 numbers as input and print the largest number.

package com.dsa;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2)
            System.out.println(num1+" is larger");
        else
            System.out.println(num2+" is larger");
    }
}
