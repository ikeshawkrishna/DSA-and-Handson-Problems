package org.dsa.stringRelated;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
public class LongestSubstringWithKUniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tvtgv";
		int k = 4;
		int longestKSubstr = longestKSubstr(str,k);
		System.out.println(longestKSubstr);
	}
	
	public static int longestKSubstr(String str, int k) {
        // code here
        int maxCount = -1;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < str.length(); right++) {
        		char rightChar = str.charAt(right);
        		map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
        		
        		while(map.size() > k) {
        			char leftChar = str.charAt(left);
        			map.put(leftChar, map.get(leftChar) - 1);
        			
        			if(map.get(leftChar) == 0) {
        				map.remove(leftChar);
        			}
        			left++;
        		}
        		if(map.size() == k) {
        			maxCount = Math.max(maxCount, right - left + 1);
        		}
        		
        }
        return maxCount;
    }

}
