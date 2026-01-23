package org.dsa.KunalKushwaha.Recursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {

        int[] arr = {1,10,4,5,6,7};
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }

        return arr[i] < arr[i+1] && sorted(arr, i+1);
    }
}
