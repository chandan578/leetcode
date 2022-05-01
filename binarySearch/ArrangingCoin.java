package leetcode.binarySearch;

import java.util.Scanner;

/*
Arranging Coins
Easy

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:


Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 

Constraints:

1 <= n <= 231 - 1
*/
public class ArrangingCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arrangeCoin(n));
        sc.close();
    }
    private static int arrangeCoin(int n) {
        long start = 0;
        long end = n;
     
        while (start <= end) {
            long mid = (start + end)/2;
            long coin = mid*(mid + 1)/2;
            if (coin == n) {
                return (int)mid;
            } else if (coin < n) {
                start = mid + 1;
              
            } else {
                end = mid - 1;
            }
        }
        return (int)end;
    }
}
