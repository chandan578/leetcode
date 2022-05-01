package leetcode.arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Number of Good Pairs
Easy

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/
public class NumberOfGoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(goodPair(arr));
        sc.close();
    }
    private static int goodPair(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(nums[i])) {
                int val = hMap.get(nums[i]);
                count += val;
                val ++;
                hMap.put(nums[i], val);
            } else {
                hMap.put(nums[i], 1);
            }
        }
        return count;
    }
}
