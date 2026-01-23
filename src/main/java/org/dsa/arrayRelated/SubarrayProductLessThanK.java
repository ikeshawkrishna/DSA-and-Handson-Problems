package org.dsa.arrayRelated;

//https://leetcode.com/problems/subarray-product-less-than-k/description/
public class SubarrayProductLessThanK {

	public static void main(String[] args) {

		int[] nums = {10,5,2,6};
		int k = 100;
		int simpleApproch = numSubarrayProductLessThanK(nums, k);
		System.out.println(simpleApproch);
	}

	public static int SimpleApproch(int[] nums, int k) {
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j < nums.length; j++) {
				int prodSum = 1;
				for(int m = i; m <= j; m++) {
					prodSum *= nums[m];
				}
				if(prodSum < k) {
					count++;
				}
			}
		}
		return count;
	}
	
	/*	Sliding window and two pointer approach
	 * 
	 * 
	 * */
//	{10,5,2,6}
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k <= 1){
            return 0;
        }
		int count = 0;
		int left = 0;
		int productSum = 1;
		for(int right = 0; right < nums.length; right++) {
			productSum = productSum * nums[right];
			
			while(productSum >= k) {
				productSum = productSum / nums[left];
				left++;
			}
			
			count = count + (right - left + 1);
		}
		
		
		return count;
	}
}
