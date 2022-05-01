package leetcode.arrays;

import java.util.Scanner;
/*
 Find Numbers with Even Number of Digits
Easy

Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
*/
public class FindNumsWithEvenNumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumber(arr));
        sc.close();
    }

    private static int findNumber(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                digit++;
            }
            if (digit % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
