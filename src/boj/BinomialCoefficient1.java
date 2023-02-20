package boj;

import java.util.Scanner;

public class BinomialCoefficient1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int top = 1;
        int bot1 = 1;
        int bot2 = 1;

        for (int i = 1; i <= N; i++) {
            top *= i;
        }
        for (int i = 1; i <= (N - K); i++) {
            bot1 *= i;
        }
        for (int i = 1; i <= K; i++) {
            bot2 *= i;
        }
        System.out.println(top / (bot1 * bot2));
    }
}
