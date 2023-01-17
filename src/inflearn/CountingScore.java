package inflearn;

import java.util.Scanner;

public class CountingScore {
    public int solution(int count, int[] arr) {
        int[] tmpArr = new int[count];
        int score = 0;
        int tmp = 0;

        for(int i=0; i<count; i++) {
            if(arr[i] == 1) {
                tmp++;
                tmpArr[i] = tmp;
            } else {
                tmp = 0;
                tmpArr[i] = 0;
            }
        }
        for(int i=0; i<count; i++) {
            score += tmpArr[i];
        }
        return score;
    }

    public static void main(String[] args) {
        CountingScore c = new CountingScore();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr = new int[count];

        for(int i=0; i<count; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(c.solution(count, arr));
    }
}
