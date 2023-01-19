package inflearn;

import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int con = sc.nextInt();

        int[] arr = new int[day];

        for (int i = 0; i < day; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0, answer;

        for (int i = 0; i < con; i++) {
            sum += arr[i];
        }

        answer = sum;

        for (int i = con; i < day; i++) {
            sum += (arr[i] - arr[i - con]);
            answer = Math.max(sum, answer);
        }

        System.out.println(answer);

    }
}
