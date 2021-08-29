package com.dsa;

import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int temp,temp1,temp2;
        System.out.println("Enter two numbers");
        int number1= input.nextInt();
        int number2= input.nextInt();
        temp1=number1;
        temp2=number2;
        while(temp2!=0){
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }
        int hcf=temp1;
        int lcm=(number1*number2)/hcf;
        System.out.println("The hcf of "+number1+" and "+number2+" is "+hcf);
        System.out.println("The lcm of "+number1+" and "+number2+" is "+lcm);
    }
}
