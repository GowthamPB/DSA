package com.dsa;

import java.util.Scanner;

public class Permutation {
   static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the values for n and r");
        int n= input.nextInt();
        int r= input.nextInt();
        int permutation=factorial(n)/factorial(n-r);
        System.out.println("THe value of "+n+"p"+r+" is "+permutation);
    }
}
