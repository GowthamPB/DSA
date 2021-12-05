package com.dsa.functions;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        int age = input.nextInt();
        vote(age);
    }

    static void vote(int age) {
        if (age < 18) {
            System.out.println("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}
