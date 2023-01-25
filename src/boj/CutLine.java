package boj;

import java.util.Arrays;
import java.util.Scanner;

public class CutLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int line = sc.nextInt();

        int[] arr = new int[people];
        for (int i = 0; i < people; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[arr.length-line]);

    }
}
