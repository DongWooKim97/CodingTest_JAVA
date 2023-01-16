package inflearn;

import java.util.Scanner;

public class PiboNumber {
    public int[] solution(int a) {
        int[] answer = new int[a];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < a; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        PiboNumber p = new PiboNumber();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int x : p.solution(a)) {
            System.out.print(x + " ");
        }
    }
}