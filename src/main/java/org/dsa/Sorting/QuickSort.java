package org.dsa.Sorting;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {1,23,6,111,42,2};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);

        System.out.println(Arrays.toString(arr));
    }

    public static  void quickSort(int[] arr,int low,int high){


        if(low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr, low, pivot-1); //Left part
            quickSort(arr, pivot+1, high); //Right part
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int i=low-1;
        int pivot = arr[high];
        //int temp = 0;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
