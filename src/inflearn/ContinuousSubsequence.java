package inflearn;

import java.util.Scanner;

public class ContinuousSubsequence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lt = 0, rt = 0, sum = 0, answer = 0;
        int count = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        while (rt < count) {
            if (sum == target) {
                answer++;
                sum -= arr[lt++];
            } else if (sum < target) {
                sum += arr[rt++];
            } else {
                sum -= arr[lt++];
            }
        }

        if (sum == count) answer++;

        while (lt < count) {
            sum -= arr[lt++];
            if (sum == target) {
                answer++;
            }
            if (sum < target) break;
        }
        System.out.println(answer);
    }




}