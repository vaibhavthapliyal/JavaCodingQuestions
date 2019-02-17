package com.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Difficulty: Easy
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author Vaibhav Thapliyal
 *
 */
public class TwoSum {
	
	/*
	 * A Two pass algo solution to the problem
	 */
	public int[] twoSum(int[] nums, int target) {
		int indexes[] = new int [2];
		HashMap<Integer, Integer> hashtable = new HashMap<>();
		
		for(int i=0; i < nums.length; i++){
			hashtable.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (hashtable.get(target - nums[i])!= null && hashtable.get(target - nums[i]) != i) {
				indexes[0] = i;
				indexes[1] = hashtable.get(target - nums[i]);
				return indexes;
			}
		}
		return indexes;
	}
}
