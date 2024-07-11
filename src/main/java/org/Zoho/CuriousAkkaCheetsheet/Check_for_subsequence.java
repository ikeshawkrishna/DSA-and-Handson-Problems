package org.Zoho.CuriousAkkaCheetsheet;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1
public class Check_for_subsequence {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(isSubSequence("AXY","YADXCP"));
        //System.out.println(subSequence("","YADXCP",list));
    }

    //Easy and efficient approach
    static boolean isSubSequence(String A, String B){
        int i = 0;
        int j = 0;
        while(i < A.length() && j < B.length()){
            if(A.charAt(i) == B.charAt(j)){
                i++;
            }
            j++;
        }

        return i == A.length();
    }



    //Time Consuming
    static boolean isSubSequence1(String A, String B){
        List<String> list = subSequence("",B,new ArrayList<>());
        if(!list.contains(A)){
            return false;
        }
        return true;
    }

    static List<String> subSequence(String p , String up, List<String> list){
        if(up.isBlank()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        subSequence(p + ch,up.substring(1),list);
        subSequence(p ,up.substring(1),list);

        return list;
    }
}
