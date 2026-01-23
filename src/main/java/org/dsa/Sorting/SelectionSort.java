package org.dsa.Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {6,5,2,8,7,4};
        int size = arr.length;
        int min = -1;
        int temp = 0;

        System.out.println("Before sorting :: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();

        for (int i = 0; i < size; i++) {
            min = i;
            for (int j = i+1; j < size; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("\n\nAfter sorting :: ");
        for(int val : arr) {
            System.out.print(val + " ");
        }

    }

}
