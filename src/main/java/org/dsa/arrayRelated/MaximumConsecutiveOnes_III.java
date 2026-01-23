package org.dsa.arrayRelated;

public class MaximumConsecutiveOnes_III {

	public static void main(String[] args) {
//		0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1 
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int longestOnes = longestOnes(nums, k);
		System.out.println(longestOnes);
	}

	public static int longestOnes(int[] nums, int k) {
		int zeros = 0;
		int maxlen = 0;
		int left = 0;
		
		for(int right = 0; right < nums.length; right++) {
			if(nums[right] == 0) {
				zeros++;
			}
			
			while(zeros > k) {
				if(nums[left] == 0) {
					zeros--;
				}
				left++;
			}
			
			if(zeros <= k) {
				maxlen = Math.max(maxlen, right - left + 1);
			}
		}
		
		return maxlen;
	}
}
