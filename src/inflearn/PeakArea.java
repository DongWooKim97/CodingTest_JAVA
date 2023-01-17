package inflearn;

import java.util.Scanner;

public class PeakArea {
    public static void main(String[] args) {
        PeakArea p = new PeakArea();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size + 2][size + 2];


        int start = arr.length - size - 1;
        int peak = 0;

        for (int i = start; i <= size; i++) {
            for (int j = start; j <= size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = start; i <= size; i++) {
            for (int j = start; j <= size; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] &&
                        arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1]) {
                    peak++;
                }
            }
        }
        System.out.println(peak);





    }
}
