package com.dsa;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float interest=0,total_interest=0;
        System.out.println("Enter the principal,rate of interest and time");
        float amount= input.nextInt();
        float rate= input.nextFloat();
        int time= input.nextInt();
        for(int i=0;i<time;i++) {
            interest=(amount*(rate/100));
            amount=amount+interest;
            total_interest=total_interest+interest;
        }
        System.out.println("The compound interest after "+time+" years is "+total_interest);
        System.out.println("The final amount after "+time+" years is "+amount);
    }
}
