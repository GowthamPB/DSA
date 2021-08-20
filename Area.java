package com.dsa;

import java.lang.Math;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float area=0;
        float length,breadth,base,height,radius,diagonal1,diagonal2;
        System.out.println("Find area of \n1.Circle \n2.Triangle \n3.Rectangle \n4.Isosceles triangle \n5.Parallelogram \n6.Rhombus \n7.Equilateral triangle");
        System.out.print("Enter your choice: ");
        int choice=input.nextInt();
        switch (choice){
            case 1://area of triangle
                System.out.println("Enter radius of circle");
                radius=input.nextFloat();
                area=3.14f*radius*radius;
                break;
            case 2://area of scalene triangle
                System.out.println("Enter length of base and height" );
                base=input.nextFloat();
                height=input.nextFloat();
                area=0.5f*base*height;
                break;
            case 3://area of rectangle
                System.out.println("Enter length and breadth of rectangle");
                length = input.nextFloat();
                breadth=input.nextFloat();
                area=length*breadth;
                break;
            case 4://area of isosceles triangle
                System.out.println("Enter length and breadth of rectangle");
                length = input.nextFloat();
                breadth=input.nextFloat();
                area=length*breadth;
                break;
            case 5://area of parallelogram
                System.out.println("Enter length of base and height" );
                base=input.nextFloat();
                height=input.nextFloat();
                area=base*height;
                break;
            case 6://area of rhombus
                System.out.println("Enter the length of both diagonals");
                diagonal1=input.nextFloat();
                diagonal2=input.nextFloat();
                area=0.5f*diagonal1*diagonal2;
                break;
            case 7://area of equilateral triangle
                System.out.println("Enter the length of side");
                length=input.nextFloat();
                area= (float) ((Math.sqrt(3)*length*length)/4);
                break;
            default:
                System.out.println("Enter proper choice");
        }
        System.out.print("Area is: "+area);
    }
}
