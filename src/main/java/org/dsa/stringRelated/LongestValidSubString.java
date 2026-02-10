package org.dsa.stringRelated;

import java.util.List;

//https://leetcode.com/problems/length-of-the-longest-valid-substring/
public class LongestValidSubString {

	public static void main(String[] args) {
		String word = "leetcode";
		List<String> forbidden = List.of("de","le","e");
		int longestValidSubstring = longestValidSubstring(word, forbidden);
		System.out.println(longestValidSubstring);
		System.out.println(word.substring(0, 1+1));
	}

	public static int longestValidSubstring(String word, List<String> forbidden) {
		int maxcount = 0;
		int left = 0;
		
		for(int right = 0; right < word.length(); right++) {
			
			// Check if any forbidden word ends at current position
			for(String forbiddenWord : forbidden) {
				int len = forbiddenWord.length();
				// Check if this forbidden word is at the end of current window
				if(right >= len - 1) {
					String substring = word.substring(right - len + 1, right + 1);
					if(substring.equals(forbiddenWord)) {
						// Move left pointer to skip this forbidden word
						left = Math.max(left, right - len + 2);
					}
				}
			}
			
			maxcount = Math.max(maxcount, right - left + 1);
		}
		return maxcount;
	}
}
