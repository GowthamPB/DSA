package com.dsa;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float length,width,radius,height,base,volume=0;
        System.out.println("Find volume of \n1.Cone \n2.Prism \n3.Cylinder \n4.Sphere \n5.Pyramid \nEnter your choice number");
        int choice=input.nextInt();
        switch (choice) {
            case 1 ://Volume of cone
                System.out.println("Enter value of radius and height");
                radius = input.nextFloat();
                height = input.nextFloat();
                volume = (3.14f * radius * radius * height)/ 3;
                break;
            case 2 ://Volume of prism
                System.out.println("Enter the area of base and height of prism");
                base = input.nextFloat();
                height = input.nextFloat();
                volume = base * height;
                break;
            case 3://Volume of cylinder
                System.out.println("Enter value of radius and height");
                radius = input.nextFloat();
                height = input.nextFloat();
                volume = 3.14f * radius * radius * height;
                break;
            case 4 ://Volume of sphere
                System.out.println("Enter the radius of sphere");
                radius = input.nextFloat();
                volume = (4 * 3.14f * radius * radius * radius) / 3;
                break;
            case 5 ://Volume of pyramid
                System.out.println("Enter the base length,base width,pyramid height");
                length = input.nextFloat();
                width = input.nextFloat();
                height = input.nextFloat();
                volume = (length * width * height) / 3;
                break;
            default:
                System.out.println("Enter proper choice");
        }
        System.out.println("Volume is "+volume);
    }
}
