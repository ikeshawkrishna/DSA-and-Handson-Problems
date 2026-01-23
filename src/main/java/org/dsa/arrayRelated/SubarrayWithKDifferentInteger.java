package org.dsa.arrayRelated;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarrays-with-k-different-integers/description/
public class SubarrayWithKDifferentInteger {

	public static void main(String[] args) {
		int[] nums = {1,2,1,2,3};
		int k = 2;
		
		int subarraysWithKDistinct = subarraysWithKDistinct(nums, k);
		System.out.println(subarraysWithKDistinct);
	}

	public static int subarraysWithKDistinct(int[] nums, int k) {
		return atmost(nums, k) - atmost(nums, k-1);
		
	}
	
	public static int atmost(int[] nums, int k) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int left = 0;
		
		for(int right = 0; right < nums.length; right++) {
			int rightElement = nums[right];
			map.put(rightElement, map.getOrDefault(rightElement, 0) + 1);
			
			
			while(map.size() > k) {
				int leftElement = nums[left];
				map.put(leftElement, map.get(leftElement) - 1);
				
				if(map.get(leftElement) == 0) {
					map.remove(leftElement);
				}
				left++;
			}
			count = count + (right - left + 1);
			
		}
		return count;
	}
}
