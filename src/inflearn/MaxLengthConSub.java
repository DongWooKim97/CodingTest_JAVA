package inflearn;

import java.util.Scanner;

public class MaxLengthConSub {
    public static void main(String[] args) {
        MaxLengthConSub m = new MaxLengthConSub();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int max = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(m.solution(count, max, arr));

    }

    public int solution(int count, int max, int[] arr) {
        int lt = 0, len = 0, tmp = max;

        for (int rt = 0; rt < count; rt++) {
            if (arr[rt] == 1) {
                len++;
            } else if (tmp != 0 && arr[rt] == 0) {
                len++;
                tmp--;
            } else {
                if (tmp == 0 && arr[rt] == 0) {
                    while (tmp != max) {
                        if (arr[lt] == 0) {
                            tmp++;
                        }

                        len--;
                        lt++;
                    }
                }
            }
        }

        return len;
    }
}
