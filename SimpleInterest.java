//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

package com.dsa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principal amount,time,rate of interest:");
        int principal=input.nextInt();
        int time=input.nextInt();
        float interest=input.nextFloat();
        float SI=(principal*time*interest)/100;
        System.out.println("The simple interest is "+SI);
    }
}
