package org.dsa.basicMaths;

// https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }

    public static boolean optimal(int x){
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x / 10;
        }

        return x == reverse || x == reverse / 10;
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        String str = String.valueOf(x);
        for (int i = 0,j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
