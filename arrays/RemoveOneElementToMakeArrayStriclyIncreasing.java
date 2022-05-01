package leetcode.arrays;

import java.util.Scanner;

/**
 * RemoveOneElementToMakeArrayStriclyIncreasing
 */
public class RemoveOneElementToMakeArrayStriclyIncreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canBeIncreasing(arr));
        sc.close();
    }

    private static boolean canBeIncreasing(int[] nums) {
        for (int i = 0, faults = 0; i+1 < nums.length; i++) {
            if (nums[i] >= nums[i + 1]) {
                if (++faults == 2) {
                    return false;
                }
                if (i != 0 && nums[i - 1] >= nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}