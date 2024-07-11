package org.Zoho.CuriousAkkaCheetsheet;

public class PrimeNumberInGivenRange {

    public static void main(String[] args) {
        //System.out.println(isPrime(23));
        printPrimes(1,10);
    }
    static void printPrimes(int start,int end){
        for (int i = start; i < end; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n){
        if(n==1||n==0)return false;

        for(int i=2; i<=n/2; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(n%i==0) {
                return false;
            }
        }
        //otherwise, n is prime number.
        return true;
    }
}
