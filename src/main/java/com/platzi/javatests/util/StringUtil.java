package com.platzi.javatests.util;

public class StringUtil {

    public enum isEmptyCase {
        IS_EMPTY, IS_NOT_EMPTY
    }
    public static String repeat (String str, int times){

        if(times <0){
            throw new IllegalArgumentException("Negative times not allowed");
        }
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }

    public static boolean isEmpty(String str){
        return str == null || str.trim().equals("");
    }
}
