package com.dsa;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,temp=1;
        System.out.println("Enter a number");
        int number=input.nextInt();
        int num=number;
        while(number>0){
            temp=number%10;
            number=number/10;
            sum=sum+temp;
        }
        System.out.println("Sum of the numbers of "+num+" is "+sum);
    }
}
