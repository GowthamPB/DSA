//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.dsa;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        System.out.println("Enter \n+ for addition \n- for subtraction \n* for multiplication \n/ for division \nEnter your choice: ");
        char operator=input.next().charAt(0);
        if(operator=='+')
            System.out.print("The sum is: "+(num1+num2));
        else if(operator=='-')
            System.out.println("The difference is: "+(num1-num2));
        else if(operator=='*')
            System.out.println("The product is: "+(num1*num2));
        else
            System.out.println("The quotient is: "+(num1/num2));
    }
}
