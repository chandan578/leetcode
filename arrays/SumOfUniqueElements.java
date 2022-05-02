package leetcode.arrays;

import java.util.HashMap;
import java.util.Scanner;
/*
Sum of Unique Elements
Easy

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/
public class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(sumOfUniqueElement(nums));
        sc.close();
    }
    private static int sumOfUniqueElement(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int key : nums) {
            if (hMap.containsKey(key)) {
                int val = hMap.get(key);
                val ++;
                hMap.put(key, val);
            } else {
                hMap.put(key, 1);
            }
        }
        int sum = 0;
        for (int i : nums) {
            if (hMap.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
