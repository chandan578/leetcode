package leetcode.arrays;

import java.util.Scanner;

/*
Defuse the Bomb
Easy

You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.

To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.

If k > 0, replace the ith number with the sum of the next k numbers.
If k < 0, replace the ith number with the sum of the previous k numbers.
If k == 0, replace the ith number with 0.
As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!

Example 1:

Input: code = [5,7,1,4], k = 3
Output: [12,10,16,13]
Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
Example 2:

Input: code = [1,2,3,4], k = 0
Output: [0,0,0,0]
Explanation: When k is zero, the numbers are replaced by 0. 
Example 3:

Input: code = [2,4,9,3], k = -2
Output: [12,5,6,13]
Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4]. Notice that the numbers wrap around again. If k is negative, the sum is of the previous numbers.
 

Constraints:

n == code.length
1 <= n <= 100
1 <= code[i] <= 100
-(n - 1) <= k <= n - 1
*/
public class DefuseTheBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = decrypt(arr, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }

    private static int[] decrypt(int[] code, int K) {
        if (K == 0) {
            return new int[code.length];
        } else {
            int l = code.length;
            int[] sum = new int[l];
            sum[0] = code[0];
            for (int i = 1; i < l; i++) {
                sum[i] = sum[i - 1] + code[i];
            }
            int k = Math.abs(K);
            for (int i = 0; i < l; i++) {
                int diff = l - i - 1;
                if (diff >= k) {
                    code[i] = sum[i + k] - sum[i];
                } else {
                    code[i] = sum[i - 1] - sum[i] + sum[k - diff - 1];
                }

            }
            if (k > 0) {
                return code;
            } else {
                int i = 0;
                while (i + k + 1 < l) {
                    sum[i + k + 1] = code[i++];
                }
                i = l - k - 1;
                int c = 0;
                while (i < l) {
                    sum[c++] = code[i++];
                }
                return sum;
            }

        }
    }
}
