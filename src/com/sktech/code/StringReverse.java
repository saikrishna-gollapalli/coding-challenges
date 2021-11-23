package com.sktech.code;

public class StringReverse {
    public static void main(String[] args) {
        String input = "SaiKrishna Gollapally is a brilient";
        StringBuffer output = new StringBuffer();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        System.out.println(output.toString());
    }
}
