package org.dsa.stringRelated;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithUniqueCharaters {

	public static void main(String[] args) {
		String str = "abcacbcbb";
		int lengthOfLongestSubstring = lengthOfLongestSubstring(str);
		System.out.println(lengthOfLongestSubstring);
	}
	
	public static int lengthOfLongestSubstring(String str) {
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Set<Character> set = new HashSet<>();
        
        int left = 0;
        for(int right = 0; right < str.length(); right++) {
        		char rightChar = str.charAt(right);
        		
//        		map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
//        		while(map.get(rightChar) > 1) {
//        			char leftChar = str.charAt(left);
//        			map.put(leftChar, map.get(leftChar) - 1);
//        			
//        			if(map.get(leftChar) == 0) {
//        				map.remove(leftChar);
//        			}
//        			left++;
//        		}
        		while(set.contains(rightChar)) {
        			char leftChar = str.charAt(left);
        			set.remove(leftChar);
        			left++;
        		}
        		set.add(rightChar);
        		maxCount = Math.max(maxCount, right - left + 1);
        }
        
        return maxCount;
    }
}
