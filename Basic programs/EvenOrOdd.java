//Write a program to print whether a number is even or odd, also take input.

package com.dsa;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}