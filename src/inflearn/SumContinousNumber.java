package inflearn;

import java.util.Scanner;

public class SumContinousNumber {
    public static void main(String[] args) {
        SumContinousNumber s = new SumContinousNumber();
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int[] arr = new int[target + 1];

        for (int i = 1; i <= target; i++) {
            arr[i] = i;
        }

        System.out.println(s.solution(target, arr));
    }

    public int solution(int target, int[] arr) {
        int count = 0, sum = 0, lt = 1;
        for (int rt = 1; rt < target; rt++) {
            sum += arr[rt];
            if (sum == target) {
                count++;
            }
            while (sum >= target) {
                sum -= arr[lt++];
                if (sum == target) {
                    count++;
                }
            }
        }

        return count;
    }
}
