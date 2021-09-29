package com.dsa;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float perimeter=0;
        float length,breadth,base,radius,side;
        System.out.println("Find perimeter of \n1.Circle \n2.Square \n3.Rectangle \n4.Parallelogram \n5.Rhombus \n6.Equilateral triangle");
        System.out.print("Enter your choice: ");
        int choice=input.nextInt();
        switch (choice){
            case 1://perimeter of circle
                System.out.println("Enter radius of circle");
                radius=input.nextFloat();
                perimeter=3.14f*2*radius;
                break;
            case 2://perimeter of square
                System.out.println("Enter length of a side" );
                length=input.nextFloat();
                perimeter=4*length;
                break;
            case 3://perimeter of rectangle
                System.out.println("Enter length and breadth of rectangle");
                length = input.nextFloat();
                breadth=input.nextFloat();
                perimeter=2*(length+breadth);
                break;
            case 4://perimeter of parallelogram
                System.out.println("Enter base and side of parallelogram");
                base = input.nextFloat();
                side=input.nextFloat();
                perimeter=2*(base+side);
                break;
            case 5://perimeter of rhombus
                System.out.println("Enter the length of the side of rhombus");
                side =input.nextFloat();
                perimeter=4*side;
                break;
            case 6://perimeter of equilateral triangle
                System.out.println("Enter the length of side");
                length=input.nextFloat();
                perimeter=3*length;
                break;
            default:
                System.out.println("Enter proper choice");
        }
        System.out.print("Perimeter is: "+perimeter);
    }
}
