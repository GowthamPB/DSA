//Take name as input and print a greeting message for that name.

package com.dsa;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=input.nextLine();
        System.out.println("Hello "+name+".It's a pleasue to have you here :)");
    }
}
