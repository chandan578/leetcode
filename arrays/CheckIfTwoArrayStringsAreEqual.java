package leetcode.arrays;

import java.util.Scanner;
/*
Check If Two String Arrays are Equivalent
Easy

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 

Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
*/
public class CheckIfTwoArrayStringsAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String[] arr1 = new String[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }
        int n2 = sc.nextInt();
        String[] arr2 = new String[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }
        System.out.println(arrayStringsEqual(arr1, arr2));
        sc.close();
    }
    private static boolean arrayStringsEqual(String[] word1, String[] word2) {
        // String str1 = String.join("d", word1);
        // String str2 = String.join("d", word2);
        // boolean check = str1.equals(str2);
        // return check;
        return String.join("", word1).equals(String.join("", word2));
    }
}
