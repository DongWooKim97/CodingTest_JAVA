package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayDecimalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        boolean[] prime = new boolean[end + 1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }


        for (int i = start; i <= end; i++) {
            if (!prime[i]) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }

            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }


//      원래 나의 풀이 ==> 근데 틀림 ㅜ
//        for (int i = start; i <= end; i++) {
//            boolean check = true;
//            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check) list.add(i);
//        }
//
//        for (int x : list) sum += x;
//
//        if (sum != 0) {
//            System.out.println(sum);
//            System.out.println(list.get(0));
//        } else {
//            System.out.println(-1);
//        }
    }
}
