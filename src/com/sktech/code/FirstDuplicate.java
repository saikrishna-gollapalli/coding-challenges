package com.sktech.code;

public class FirstDuplicate {

	public static void main(String[] args) {
		int[] input = { 2, 3, 1, 1, 3, 2 };
		System.out.println("First Duplicate Value ::::: "+ findFirstDuplicate(input));
	}

	private static int findFirstDuplicate(int[] input) {
		//1st solution
		/*
		 * HashSet<Integer> seen = new HashSet<>(); for (int i = 0; i < input.length;
		 * i++) { if (seen.contains(input[i])) { return input[i]; } else {
		 * seen.add(input[i]); } } return -1;
		 */
		//2nd Solution with less space
		for (int i = 0; i < input.length; i++) {
			if(input[Math.abs(input[i])-1] < 0) {
				return Math.abs(input[i]);
			} else {
				input[Math.abs(input[i])-1] = -input[Math.abs(input[i])-1];
			}
		}
		return -1;
	}

}
