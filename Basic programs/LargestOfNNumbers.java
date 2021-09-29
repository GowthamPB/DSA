package com.dsa;

import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(String[] args) {
        int large=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers to find the largest number(enter zero to terminate): ");
        while(true){
            int num= input.nextInt();
            if(num!=0) {
                if (large < num)
                    large = num;
            }
            else
                break;
        }
        System.out.println("Largest number is "+large);
    }
}
