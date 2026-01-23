package org.dsa.Searcing;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {2,6,9,21,27,32,35};
        System.out.println("Hello world!");
        System.out.println(linearSearch(arr,6));
        System.out.println(binarySearch(arr,6));
    }

    public static int linearSearch(int[] arr,int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //[2,6,9,21,27,32,35]  target = 9
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;

        while(start <= end) {
            mid = (start + end)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}