//Input currency in rupee and output in dollar.

package com.dsa;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount in rupees: ");
        float amount=input.nextInt();
        System.out.println(amount+" rupees in dollars is "+(amount/74.29)); //Currently one dollar is equal to 74.29 rupees
    }
}
