package com.dsa;

import java.util.Scanner;
import  java.lang.Math;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the initial value,rate of depreciation,time in years");
        int initial_value=input.nextInt();
        float rate= input.nextFloat();
        int time=input.nextInt();
        float final_value= (float) (initial_value * Math.pow((1 - rate / 100),time));
        System.out.println("The final value after depreciation is "+final_value);
    }
}
