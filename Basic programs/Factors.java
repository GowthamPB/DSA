//Input a number and print all the factors of that number (use loops).

package com.dsa;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.print("Factors of "+num+" are: 1 ");
        for(int i=2;i<=num/2;i++) {
            if (num % i == 0)
                System.out.print(i+" ");
        }
        System.out.println(num);
    }
}
