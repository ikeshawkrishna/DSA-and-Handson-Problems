package org.dsa.arrayRelated;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int target = 1;
		int array[] = {1,3,5,6,7,8};
		
		/*TODO
		 * Using 2 pointers
		 * if sum is lesser left ++;
		 * if sum is greater right ++;
		 * */
		if(array.length < 2) {
			System.out.println("Invalid array");
			return;
		}
		
		int left = 0, right = array.length - 1;
		while(left != right) {
			if((array[left] + array[right]) < target) {
				left++;
			} else if ((array[left] + array[right]) > target) {
				right--;
			} else {
				System.out.println("Index are " + left + " " + right);
				return;
			}
		}
		System.out.println("Not available");
	}

}
