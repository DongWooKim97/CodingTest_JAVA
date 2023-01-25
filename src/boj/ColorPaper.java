package boj;

import java.util.Scanner;

public class ColorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int paper = sc.nextInt();
        boolean[][] map = new boolean[100][100];
        int[][] arr = new int[paper][2];


        for (int i = 0; i < paper; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;

        for (int[] ints : arr) {
            int x = ints[0];
            int y = ints[1];

            for (int a = x; a < (x + 10); a++) {
                for (int b = y; b < (y + 10); b++) {
                    if (!map[a][b]) {
                        map[a][b] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
