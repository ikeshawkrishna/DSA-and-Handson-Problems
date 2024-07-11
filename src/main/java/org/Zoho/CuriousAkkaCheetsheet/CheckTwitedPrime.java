package org.Zoho.CuriousAkkaCheetsheet;

//https://www.geeksforgeeks.org/problems/twisted-prime-number0500/1
public class CheckTwitedPrime {

    public static void main(String[] args) {
        System.out.println(isTwistedPrime(79));

        //System.out.println(isPrime(97));
    }

    static int isTwistedPrime(int N) {
        // code here

        if(isPrime(N)){
            return 1;
        }

        int reverseNum = 0;
        int num1 = N;
        while(num1 != 0){
            int num = num1%10;
            reverseNum = reverseNum * 10 + num;
            num1 = num1/10;
        }

        if(isPrime(reverseNum)){
            return 1;
        }
        return 0;
    }

    static boolean isPrime(int num){
        if(num == 1 || num == 0){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }
}
