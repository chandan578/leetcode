package leetcode.binarySearch;

import java.util.Scanner;

/*
Find Peak Element
Medium

A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.
*/
public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println(peakIndex(arr));
        sc.close();
    }
    private static int peakIndex(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (mid + 1 >= arr.length) {
                end = mid - 1;
            } else {
                if (arr[mid] > arr[mid + 1]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}
