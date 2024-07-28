package org.LeetCode.DailyQuestions;

import java.util.*;

//https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
public class Sort_Array_by_Increasing_Frequency {

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3};

        frequencySort(nums);
    }

    public static void frequencySort(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for(int n : nums){
            map.put(n, map.getOrDefault(n , 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Comparator<Map.Entry<Integer,Integer>> com = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
                if(m1.getValue() == m2.getValue()){
                    return m2.getKey() - m1.getKey();
                }else{
                    return m1.getValue() - m2.getValue();
                }
            }
        };

        Collections.sort(list,com);

//        for (Map.Entry<Integer,Integer> e : list){
//            System.out.println(e);
//        }

        int k = 0;

        for(Map.Entry<Integer , Integer> m : list){
            int val = m.getValue();

            while(val > 0){
                nums[k++] = m.getKey();
                val--;
            }
        }

    }
}
