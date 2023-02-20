package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        while (arr[0] != 0 && arr[1] != 0 && arr[2] != 0) {
            Arrays.sort(arr);
            if (Math.sqrt(arr[2] * arr[2]) == Math.sqrt((arr[0] * arr[0]) + (arr[1] * arr[1]))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

        }
    }
}
