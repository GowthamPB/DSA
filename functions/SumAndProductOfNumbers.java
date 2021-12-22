package com.dsa.functions;

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n > 0) {
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n = n / 10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Solution sol = new Solution();
        int result = sol.subtractProductAndSum(num);
        System.out.println(result);
    }
}
//Subtract the Product and Sum of Digits of an Integer
//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
