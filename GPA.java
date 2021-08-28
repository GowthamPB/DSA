package com.dsa;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the percentage");
        float percent= input.nextFloat();
        float GPA=(percent/10)+0.75f;// The GPA formula may vary depending on Universities,countries etc.
        System.out.println("The GPA is "+ GPA);
    }
}
