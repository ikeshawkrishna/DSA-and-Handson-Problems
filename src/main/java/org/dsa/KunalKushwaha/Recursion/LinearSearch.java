package org.dsa.KunalKushwaha.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,8,4};
        //System.out.println(searchindex(arr,10,0));

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(SearchAllTarget(arr,4,0,list));
    }

    private static boolean search(int[] arr,int target,int i){
        if(i == arr.length){
            return false;
        }

        if(arr[i] == target){
            return true;
        } else {
            return search(arr,target,i+1);
        }
    }

    private static int searchindex(int[] arr,int target,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        } else {
            return searchindex(arr,target,i+1);
        }
    }

    private static ArrayList SearchAllTarget(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }
        return SearchAllTarget(arr, target, i+1, list);
    }
}
