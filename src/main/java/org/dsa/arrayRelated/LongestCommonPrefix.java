package org.dsa.arrayRelated;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
	public static void main(String[] args) {

//		String[] strsStrings = {"flower","flow","flight"};
		String[] strsStrings = {"ab","a"};
//		String longestCommonPrefix = longestCommonPrefix(strsStrings);
//		System.out.println(longestCommonPrefix);
		
		String simpleApproach = simpleApproach(strsStrings);
		System.out.println(simpleApproach);
	}

//	Simple
	public static String simpleApproach(String[] strs) {
		String commonString = "";
		
		String first = strs[0];
		for(int i = 0; i < first.length(); i++) {
			for(int j = 1; j < strs.length; j++) {
				if(strs[j].length() <= i || strs[j].charAt(i) != first.charAt(i)) {
					return commonString;
				} 
			}
			commonString += first.charAt(i);
		}
		
		return commonString;
	}

//	Better
	public static String longestCommonPrefix(String[] strs) {
		String commonString = "";
		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		for(int i = 0; i < first.length(); i++) {
			if(last.indexOf(first.charAt(i)) != -1 && first.charAt(i) == last.charAt(i)) {
				commonString = commonString + first.charAt(i);
			} else {
				break;
			}
		}
		
		return commonString;
	}
}
