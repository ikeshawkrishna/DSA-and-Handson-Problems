package org.Zoho.CuriousAkkaCheetsheet;

public class pushZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {3, 0, 0, 4};
        int n = arr.length;;
        pushZerosToEnd(arr, n);
    }

    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j =0 , i = 0, temp = 0;
        for ( i = 0; i < n; i++) {
            if(arr[i] == 0){
                continue;
            } else {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }

        }

        for (int n1 : arr)
        {
            System.out.println(n1);
        }
    }

}
