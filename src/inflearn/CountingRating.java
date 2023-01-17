package inflearn;

import java.util.Scanner;

public class CountingRating {
    public static void main(String[] args) {
        CountingRating c = new CountingRating();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : c.solution(count, arr)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int count, int[] arr) {
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            int cnt = 1;
            for (int j = 0; j < count; j++) {
                if (arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }


}
