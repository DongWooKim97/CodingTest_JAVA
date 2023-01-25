package boj;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int dx = 0, dy = 0, max = -1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    dx = i;
                    dy = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(dx + " " + dy);
    }
}
