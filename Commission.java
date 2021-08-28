package com.dsa;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter base amount");
        int base= input.nextInt();
        System.out.println("Enter commission percentage");
        float percent= input.nextFloat();
        float commission=base*(percent/100);
        System.out.println("The commission amount is "+commission);
    }
}
