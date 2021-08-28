package com.dsa;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int temp,sum=0;
        System.out.println("Enter a number");
        int number= input.nextInt();
        int num=number;
        do {
            temp=number%10;
            number=number/10;
            sum=sum+(temp*temp*temp);
        }while(temp != 0);
        if(sum==num)
            System.out.println(num+" is an armstrong number");
        else
            System.out.println(num+" is not an armstrong number");
    }
}
