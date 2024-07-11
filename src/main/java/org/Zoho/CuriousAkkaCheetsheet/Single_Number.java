package org.Zoho.CuriousAkkaCheetsheet;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {

    public static void main(String[] args) {

        double square = Math.pow(Integer.valueOf("3"),Integer.valueOf("10"));
        int v = (int)square % 10;
        System.out.println(v);


        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        //System.out.println(singleNumber(nums));
        Map<String, Integer> map = new HashMap<>();
        //map.put("Keshaw",0);
        map.put("Keshaw",1);

        map.put("Krishna",1);


        //System.out.println(map.get("Keshaw"));
        //System.out.println(map.getOrDefault("Keshaw",0) + 1);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//            }
//        }

    }

    public static int singleNumber(int[] nums) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the map to find the element that appears only once
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;

    }
}
