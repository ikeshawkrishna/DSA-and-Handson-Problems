package org.dsa.arrayRelated;

//https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater {
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int simpleAppraoch = simpleAppraoch(height);
		System.out.println(simpleAppraoch);
	}
	public static int simpleAppraoch(int[] height) {
		int lmax = 0;
		int rmax = 0;
		int left = 0;
		int right = height.length - 1;
		int water = 0;
		
		while(left <= right) {
			if(height[left] <= height[right]) {
				if(height[left] >= lmax) {
					lmax = height[left];
				} else {
					water = water + (lmax - height[left]);
				}
				left++;
			} else {
				if(height[right] >= rmax) {
					rmax = height[right];
				} else {
					water = water + (rmax - height[right]);
				}
				right--;
			}
		}
		
        return water;
    }
}
