package org.dsa.KunalKushwaha.Recursion;

public class RemoveCharFromString {
    public static void main(String[] args) {
        System.out.println(removeCharWithoutRecursion(" "));
    }

    static void removeChar(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            //skip
            removeChar(p,up.substring(1));
        } else {
            //unSkip
            removeChar(p+ch,up.substring(1));
        }
    }

    static String removeChar(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            //skip
           return removeChar(up.substring(1));
        } else {
            //unSkip
            return ch + removeChar(up.substring(1));
        }
    }

    static String removeCharWithoutRecursion(String up){
        String value = "";
        if(up == null || up.isBlank()){
            return "is empty";
        }

        char ch;
        while (up.length() != 0){
            ch = up.charAt(0);
            if(ch == 'a'){
                up = up.substring(1);
            } else {
                value = value + ch;
                up = up.substring(1);
            }
        }

        return value;
    }


}
