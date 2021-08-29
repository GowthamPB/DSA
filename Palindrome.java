package com.dsa;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the string");
        String string= input.next();
        for(int i=0,j=string.length()-1;i<string.length()/2;i++,j--){
            if(string.charAt(i)!=string.charAt(j)){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(string+" is a palindrome");
        else
            System.out.println(string+" is not a palindrome");
    }
}
