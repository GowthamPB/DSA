package com.dsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        int temp;
        System.out.println("Enter the position");
        int position=input.nextInt();
        for(int i=1;i<position;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        if(position==0)
            System.out.println(a+" is in the position "+position+" of fibonacci series");
        else
            System.out.println(b+" is in the position "+position+" of fibonacci series");
    }
}
