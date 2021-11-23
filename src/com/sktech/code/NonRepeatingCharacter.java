package com.sktech.code;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "aaabbcddeef";
        System.out.println(nonFirstRepeatingChar(s));
    }
    private static char nonFirstRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return '_';
    }
}
