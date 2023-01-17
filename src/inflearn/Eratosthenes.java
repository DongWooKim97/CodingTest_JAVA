package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Eratosthenes {

    public int solution(int count) {
        int answer = 0;
        int[] era = new int[count + 1];
        for (int i = 2; i <= count; i++) {
            if (era[i] == 0) {
                answer++;
                for (int j = i; j <= count; j += i) {
                    era[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Eratosthenes e = new Eratosthenes();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        System.out.println(e.solution(count));

    }
}
