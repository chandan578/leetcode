package leetcode.arrays;

import java.util.Scanner;

/*
Element Appearing More Than 25% In Sorted Array
Easy

Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

 

Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:

Input: arr = [1,1]
Output: 1
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 105
*/
public class ElementAppearingMoreThan25perInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSpecialInteger(arr));
        sc.close();
    }
    private static int findSpecialInteger(int[] arr) {
        int x = arr.length /4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+x]){
                return arr[i];
            }
        }
        return -1;
    }
}
