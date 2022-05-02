package leetcode.string;

import java.util.Scanner;
/*
Find the Difference
Easy

You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:

Input: s = "", t = "y"
Output: "y"
 
Constraints:

0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
*/
public class FindTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(findDifference(s, t)); 
        sc.close();
    }
    private static char findDifference(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray()) {
            c ^= cs;
        }
        for (char ct  : t.toCharArray()) {
            c ^= ct;
        }
        return c;
    }
}