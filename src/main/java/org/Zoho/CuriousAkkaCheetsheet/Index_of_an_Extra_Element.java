package org.Zoho.CuriousAkkaCheetsheet;

//https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1
public class Index_of_an_Extra_Element {
    public static void main(String[] args) {
        int n = 7;
            int    arr1[] = {2,4,6,8,9,10,12};
        int arr2[] = {2,4,6,8,10,12};
        System.out.println(findExtra( n,  arr1,  arr2));
    }

    public static int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int i = 0;
        for (i = 0;i < arr2.length; i++){
            if(arr2[i] != arr1[i]){
                return i;
            }
        }
        return i+1;

    }
}
