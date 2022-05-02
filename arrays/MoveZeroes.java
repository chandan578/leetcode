package leetcode.arrays;

import java.util.Scanner;

/*
Move Zeroes
Easy

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
*/
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static void moveZeroes(int[] nums) {
        // It takes O(nlogn) DSA
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
        }
        // It takes o(n) time complexity
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != 0) {
        // nums[count] = nums[i];
        // count ++;
        // }
        // }
        // for (int i = count; i < nums.length; i++) {
        // nums[i] = 0;
        // }
    }
}
