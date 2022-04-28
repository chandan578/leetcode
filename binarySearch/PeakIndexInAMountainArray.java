package leetcode.binarySearch;

import java.util.Scanner;
/*
Peak Index in a Mountain Array
Easy
Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1

Constraints:

3 <= arr.length <= 104
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
 
Follow up: Finding the O(n) is straightforward, could you find an O(log(n)) solution?
*/
public class PeakIndexInAMountainArray {
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
