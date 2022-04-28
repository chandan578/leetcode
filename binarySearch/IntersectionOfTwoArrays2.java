package leetcode.binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
Intersection of Two Arrays II
Easy

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 
Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/
public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = commanElement(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
    private static int[] commanElement(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int key : arr1) {
            if (hMap.containsKey(key)) {
                int val = hMap.get(key);
                val ++;
                hMap.put(key, val);
            } else {
                hMap.put(key, 1);
            }
        }
        for (int key : arr2) {
            if (hMap.containsKey(key) && hMap.get(key) > 0) {
                ans.add(key);
                int val = hMap.get(key);
                val --;
                hMap.put(key, val);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
