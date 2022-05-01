package leetcode.arrays;

import java.util.Scanner;

/**
 * NumberOfRectanglesThatCanFormaSquare
 */
public class NumberOfRectanglesThatCanFormaSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(countGoodRectangles(arr));
        sc.close();
    }
    private static int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int min = rectangles[i][0];
            if (rectangles[i][1] < min) {
                min = rectangles[i][1];
            }
            if (min > max) {
                max = min;
                count = 1;
            } else if (max == min) {
                count ++;
            }
        }
        return count;
    }
}