package leetcode.binarySearch;

import java.util.Scanner;

/*
Valid Perfect Square
Easy

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false

2147483647
 
Constraints:

1 <= num <= 2^31 - 1
*/
public class ValidPrefectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
        System.out.println(isPrefectSquare(num));
        sc.close();
    }
    private static boolean isPrefectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int start = 1, end = num/2;
        while (start <= end) {
            long mid = (end + start)/2;
            if (mid*mid < num) {
                start = (int)mid + 1;
            } else if (mid*mid > num) {
                end =(int) mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
