package com.dsa;

import java.util.Scanner;

public class TSAOfCube {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of side of cube");
        float side=input.nextFloat();
        float TSA=6*side*side;
        System.out.println("Total surface area of cube is "+TSA);
    }
}
