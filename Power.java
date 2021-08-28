package com.dsa;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=1;
        System.out.println("Enter the base");
        int base= input.nextInt();
        System.out.println("Enter the power");
        int power= input.nextInt();
        for(int i=0;i<power;i++){
            result=result*base;
        }
        System.out.println(base+" to the power "+power+" is "+result);
    }
}
