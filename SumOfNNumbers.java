//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package com.dsa;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the numbers to find its sum(enter zero to terminate): ");
        while(true){
            int num= input.nextInt();
            if(num!=0)
                sum=sum+num;
            else
                break;
        }
        System.out.println("Sum is "+sum);
    }
}
