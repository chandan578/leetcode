package leetcode.binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
Intersection of Two Arrays
Easy

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
public class IntersectionOfTwoArray {
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
        int[] result = commonElement(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
    private static int[] commonElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int key : nums1) {
            if (hMap.containsKey(key)) {
                int val = hMap.get(key);
                val ++;
                hMap.put(key, val);
            } else {
                hMap.put(key, 1);
            }
        }
        
        for (int key : nums2) {
            if (hMap.containsKey(key)) {
                ans.add(key);
                hMap.remove(key);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
