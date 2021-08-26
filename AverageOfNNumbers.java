package com.dsa;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,count=0;
        float average=0;
        System.out.print("Enter numbers to take average: ");//0 as input means stop
        while(true){
            int number=input.nextInt();
            if(number==0)
                break;
            else
                sum=sum+number;
                count++;
                average=(float)sum/count;
        }
        System.out.println("The average of "+count+" numbers is "+average);
    }
}
