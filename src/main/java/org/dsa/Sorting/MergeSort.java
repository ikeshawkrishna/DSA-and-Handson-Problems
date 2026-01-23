package org.dsa.Sorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {86, 5, 19, 21, 26, 7};

        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftArrSize = mid - left + 1;
        int rightArrSize = right - mid;

        int[] leftArr = new int[leftArrSize];
        int[] rightArr = new int[rightArrSize];

        for (int i=0;i<leftArrSize;i++){
            leftArr[i] = arr[left + i];
        }

        for (int i=0;i<rightArrSize;i++){
            rightArr[i] = arr[mid + 1 + i];
        }

        int i=0;
        int j=0;
        int k=left;

        while(i < leftArrSize && j < rightArrSize){
            if(leftArr[i] <=  rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < leftArrSize){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightArrSize){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
