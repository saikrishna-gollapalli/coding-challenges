package com.sktech.code;

public class ValidatePalindrom {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String s = "algorithm";
		System.out.println("Is Polindrom : " + validatePolidrom(s));
		System.out.println("Time taken for execution :: " + (System.currentTimeMillis() - start) + "ms");
	}

	static boolean validatePolidrom(String input) {
		int left = 0, right = input.length() - 1;
		while (left < right) {
			if (input.charAt(left) == input.charAt(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}

}
