package leetcode.binarySearch;

import java.util.Scanner;

/**
Count Negative Numbers in a Sorted Matrix
Easy

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
 

Follow up: Could you find an O(n + m) solution?
 */
public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(contNegative(matrix));
        sc.close();
    }
    private static int contNegative(int[][] grid) {
        int ans = 0;
        int idx = -1;
        for (int[] tem : grid) {
            for (int i = 0; i < tem.length; i++) {
                if (tem[i] < 0) {
                    idx = i;
                    break;
                }
            }
            if (idx != -1) {
                ans += tem.length - idx;
                idx = 0;
            }
        }
        return ans;
    }
}