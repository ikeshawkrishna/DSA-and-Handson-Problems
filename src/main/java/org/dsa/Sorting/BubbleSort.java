package org.dsa.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {6,5,2,8,7,4};
        int size = arr.length;
        int temp = 0;

        System.out.println("Before sorting :: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for(int val : arr) {
                System.out.print(val + " ");
            }
        }
        System.out.println("\n\nAfter sorting :: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }

    }
}
