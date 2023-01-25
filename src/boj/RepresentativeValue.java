package boj;

import java.util.Arrays;
import java.util.Scanner;

public class RepresentativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : arr) {
            sum += x;
        }

        Arrays.sort(arr);

        System.out.println(sum / 5);
        System.out.println(arr[2]);

    }
}
