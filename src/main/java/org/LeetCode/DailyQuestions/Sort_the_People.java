package org.LeetCode.DailyQuestions;

import java.util.Map;
import java.util.TreeMap;

public class Sort_the_People {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
    }

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> list = new TreeMap<>();

        for (int i = 0; i < names.length; i++) {
            list.put(heights[i], names[i]);
        }

        int j = names.length - 1;
        for (String str : list.values()){
            names[j] = str;
            j++;
        }
        return names;
    }
}
