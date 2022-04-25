package leetcode.arrays;

import java.util.Scanner;

/*
Concatenation of Array
Easy

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]

Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
*/
public class ConcatenationFromArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sol = getConcatenation(arr);
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
        sc.close();
    }   
    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = nums[i];
        //     arr[i+n] = nums[i];
        // }
        System.arraycopy(nums, 0, arr, 0, n);
        System.arraycopy(nums, 0, arr, n, n);
        return arr;
    } 
}
