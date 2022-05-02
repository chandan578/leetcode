package leetcode.arrays;

import java.util.Scanner;

/*
Find N Unique Integers Sum up to Zero
Easy

Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 

Constraints:

1 <= n <= 1000

*/
public class FindNUniqueIntegerSumUptoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = sumZero(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    private static int[] sumZero(int n) {
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                arr[i -1] = -sum;
            } else {
                arr[i-1] = i;
                sum += i;
            }
        }
        return arr;
    }
}
