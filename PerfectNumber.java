package com.dsa;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=1;
        System.out.println("Enter a number");
        int number= input.nextInt();
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number)
            System.out.println(number+" is a perfect number");
        else
            System.out.println(number+" is not a perfect number");
    }
}
