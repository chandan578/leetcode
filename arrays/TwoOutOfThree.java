package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
Two Out of Three
Easy

Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 
Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
 

Constraints:

1 <= nums1.length, nums2.length, nums3.length <= 100
1 <= nums1[i], nums2[j], nums3[k] <= 100
*/
public class TwoOutOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] nums3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            nums3[i] = sc.nextInt();
        }
        List<Integer> list = twoOutofThree(nums1, nums2, nums3);
        System.out.println(list);
        sc.close();
    }   
    private static List<Integer> twoOutofThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        HashSet<Integer> hset = new HashSet<>();
        for (int i : nums1) {
            if (!hmap.containsKey(i)) {
                hmap.put(i, 1);
            }
        }
        for (int i : nums2) {
            if (!hmap.containsKey(i)) {
                hmap.put(i, 1);
                hset.add(i);
            } else {
                if (!hset.contains(i)) {
                    hmap.put(i, 2);
                }
            }
        }
        for (int i : nums3) {
            if (hmap.containsKey(i)) {
                hmap.put(i, hmap.getOrDefault(i, 0) + 1);
            }
        }
        for (Integer key : hmap.keySet()) {
            if (hmap.get(key) > 1) {
                list.add(key);
            }
        }
        return list;
    }
}
