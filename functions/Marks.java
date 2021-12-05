package com.dsa.functions;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subject marks");
        int marks = input.nextInt();
        System.out.println(grade(marks));
    }

    static String grade(int marks) {
        if (marks > 90 && marks <= 100) {
            return "AA";
        } else if (marks > 80 && marks <= 90) {
            return "AB";
        } else if (marks > 70 && marks <= 80) {
            return "BB";
        } else if (marks > 60 && marks <= 70) {
            return "BC";
        } else if (marks > 50 && marks <= 60) {
            return "CD";
        } else if (marks > 40 && marks <= 50) {
            return "DD";
        } else if (marks <= 40 && 0 <= marks) {
            return "Fail";
        } else {
            return ("Invalid input");
        }
    }
}
