package org.dsa.arrayRelated;

import java.util.Iterator;

//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		int[] nums = {1,8,6,2,5,4,8,3,7};
		simpleAppraoch(nums);
	}
	
	public static void simpleAppraoch(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int pmax = 0;
		int length = 0;
		int height = 0;
		while(i < j) {
			length = j - i;
			height = Math.min(nums[i], nums[j]);
			pmax = Math.max(pmax, length * height);
			if(nums[i] < nums[j]) {
				i++;
			} else {
				j--;
			}
		}
		System.out.println(pmax);
	}

}
