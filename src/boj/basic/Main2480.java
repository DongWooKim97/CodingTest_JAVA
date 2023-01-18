package boj.basic;

import java.util.Scanner;

public class Main2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 1;
        int tmp = 0;
        int result = 0;
        int max = 0;

        if (a == b) {
            count++;
            tmp = a;
            if (b == c) {
                count++;
            }
        } else if (a != b && b == c) {
            count++;
            tmp = b;
        } else if (a != b && a == c) {
            count++;
            tmp = a;
        } else {
            max = Math.max(Math.max(a, b), c);
        }

        if (count > 1) {
            if (count == 2) {
                result = (tmp * 100) + 1000;
            } else if (count == 3) {
                result = (tmp * 1000) + 10000;
            }
        } else {
            result = max * 100;
        }

        System.out.println(result);

    }

}
