package org.dsa.arrayRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,3,4,5,5,6};
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
	
		System.out.println(list);
		
	}

}
