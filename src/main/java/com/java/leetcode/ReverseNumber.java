package com.java.leetcode;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123 Output: 321 Example 2:
 * 
 * Input: -123 Output: -321 Example 3:
 * 
 * Input: 120 Output: 21 
 * 
 * Note: Assume we are dealing with an environment which
 * could only store integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0
 * when the reversed integer overflows.
 * 
 * @author Vaibhav
 *
 */
public class ReverseNumber {	
	public int reverse(int x) {
		String xs = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
		try {
			if (x < 0) {
				return -1 * Integer.parseInt(xs);
			} else
				return Integer.parseInt(xs);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
