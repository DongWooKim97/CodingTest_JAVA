package boj;

import java.util.Scanner;

public class Main1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= target; i++) {
            if (count(i)) result++;
        }
        System.out.println(result);
    }

    public static boolean count(int num) {
        if (num < 100) return true;
        else {
            int hun = num / 100;
            int ten = (num / 10) % 10;
            int one = num % 10;

            if ((hun - ten) == (ten - one)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
