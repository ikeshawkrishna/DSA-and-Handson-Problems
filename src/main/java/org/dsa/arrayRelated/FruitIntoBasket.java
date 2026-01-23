package org.dsa.arrayRelated;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/fruit-into-baskets/
public class FruitIntoBasket {
	public static void main(String[] args) {
//		0,1,2,1
//		int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
		int[] fruits = {1,0,1,4,1,4,1,2,3};
		int totalFruit = totalFruit(fruits);
		System.out.println(totalFruit);
	}

	/*
	 * TODO
	 * 1. take 2 pointers left = 0 and right = 0, traverse the array till n with right pointer
	 * 2. put each element in map
	 * 3. when the map size become > 2, decrease the value of left pointer element in map 
	  		and remove the element when becomes 0, increment left pointer
	 * 4. calculate maxlen when map size is 2
	 * */
	public static int totalFruit(int[] fruits) {
		int left = 0;
		int maxCount = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int right = 0; right < fruits.length; right++) {
			int fruit = fruits[right];
			map.put(fruit, map.getOrDefault(fruit, 0) + 1);
			if(map.size() <= 2) {
				maxCount = Math.max(maxCount, right - left + 1);
			}
			
			while(map.size() > 2) {
				map.put(fruits[left], map.get(fruits[left]) - 1);
				
				if(map.get(fruits[left]) == 0) {
					map.remove(fruits[left]);
				}
				left++;
			}
		}
		
		return maxCount;
	}
}
