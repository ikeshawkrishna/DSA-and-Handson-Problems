package org.dsa.Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {5,6,2,3,1,8};
        int size = arr.length;
        int key = -1;
        int j = 0;

        System.out.println("Before sorting :: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i-1;
            while(j>=0 && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("\n\nAfter sorting :: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }

    }
}
