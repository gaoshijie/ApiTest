package com.demo.qa.utils;

public class StringUtil {
    public static String removeSpaces(String str){
    	return str.replaceAll("[\\s]+", "");
    }
}
