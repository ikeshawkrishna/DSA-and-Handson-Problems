package org.dsa.KunalKushwaha.Recursion;

public class RemoveStringFromString {
    public static void main(String[] args) {
        System.out.println(removeStringWithoutRecursion("baappledfg","apple"));
    }

    static String removeString(String up,String target){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(target)){
            return removeString(up.substring(target.length()),target);
        } else {
            return up.charAt(0) + removeString(up.substring(1),target);
        }
    }


    static String removeStringWithoutRecursion(String up,String target){
        String value = "";
        while(up.length() != 0){
            if(up.startsWith(target)){
                up = up.substring(target.length());
            } else {
                value = value + up.charAt(0);
                up = up.substring(1);
            }
        }
        return value;
    }

}
