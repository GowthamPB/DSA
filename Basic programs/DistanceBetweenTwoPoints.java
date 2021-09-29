package com.dsa;

import java.util.Scanner;
import java.lang.Math;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter values of x and y of point 1");
        int x1=input.nextInt();
        int y1=input.nextInt();
        System.out.println("Enter values of x and y for point 2");
        int x2=input.nextInt();
        int y2=input.nextInt();
        float distance= (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The distance between the points ("+x1+","+y1+") and ("+x2+","+y2+") is "+distance);
    }
}
