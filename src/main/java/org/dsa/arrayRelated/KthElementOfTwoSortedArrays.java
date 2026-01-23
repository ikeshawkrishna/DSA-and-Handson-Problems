package org.dsa.arrayRelated;

public class KthElementOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = {2,3,6,7,9};
		int[] b = {1,4,8,10};
		int k = 5;
		
		int kthElement = kthElement(a, b, k);
		System.out.println(kthElement);
	}
	
	public static int kthElement(int a[], int b[], int k) {

		int left = 0;
		int right = 0;
		int count = 0;
		int element = 0;
		
		while(left < a.length && right < b.length) {
			if(a[left] >= b[right]) {
				element = b[right];
				right++;
				count++;
			} else {
				element = a[left];
				left++;
				count++;
			}
			
			if(count == k) {
				return element;
			}
		}
		
		while(left < a.length) {
			element = a[left];
			left++;
			count++;
			if(count == k) {
				return element;
			}
		}
		
		while(right < b.length) {
			element = b[right];
			right++;
			count++;
			if(count == k) {
				return element;
			}
		}
		
		
		return element;
    }
}
