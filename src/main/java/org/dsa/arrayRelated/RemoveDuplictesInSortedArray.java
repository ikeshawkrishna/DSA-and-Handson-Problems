package org.dsa.arrayRelated;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplictesInSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,3,4,5,5,6};
		ArrayList<Integer> removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
		
		//We can also use "SET" for simpleApproach
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		for(int num : nums) {
			linkedHashSet.add(num);
		}
		
		System.out.println(linkedHashSet);
	}
	
	/*
	 * 1. left = 0, right = 1
	 * 2. add first element to list
	 * 3. comparing left value and right value,
	 * 		if not same, adding right value to list, assigning left = right
	 * 		if same,  continue
	 * 
	 * */
	static ArrayList<Integer> removeDuplicates(int[] nums) {
        int left = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
		for(int right = 1; right < nums.length; right++) {
			if(nums[left] != nums[right]) {
				list.add(nums[right]);
				left = right;
			} else {
				continue;
			}
		}
		return list;
    }
}
