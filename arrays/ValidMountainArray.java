package leetcode.arrays;

import java.util.Scanner;

/*
Valid Mountain Array
Easy

Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 

Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
*/
public class ValidMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(validMountain(arr));
        sc.close();
    }
    private static boolean validMountain(int[] arr) {
        if (arr.length <3){
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        while (l + 1 < arr.length -1 && arr[l] < arr[l+1]) {
            l ++;
        }
        while (r-1>0 && arr[r] < arr[r-1]) {
            r--;
        }
        return l==r;
    }
}
