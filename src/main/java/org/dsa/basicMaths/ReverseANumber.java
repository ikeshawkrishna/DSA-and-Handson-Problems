package org.dsa.basicMaths;

// https://leetcode.com/problems/reverse-integer/description/
public class ReverseANumber {

    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverse(num));
    }

    //
    public static int reverse(int x) {
        int reverse = 0;
        int x1 = Math.abs(x);
        while (x1 > 0) {
            int lastDigit = x1 % 10; //Extracting last digit
            reverse = (reverse * 10) + lastDigit;
            x1 = x1 / 10; //removing last digit
        }
        if (x < 0) {
            reverse = Math.negateExact(reverse);
        }
        return reverse;
    }
}
