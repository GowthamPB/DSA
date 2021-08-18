//Program to print factorial of a number

package com.dsa;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        if(num==0)
            System.out.println("The factorial is "+1);
        else if(num>0){
            while(num!=0){
                factorial=factorial*num;
                num--;
            }
            System.out.println("The factorial is "+factorial);
        }
        else
            System.out.println("Enter proper number");
    }
}
