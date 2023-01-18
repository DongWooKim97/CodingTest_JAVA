package boj;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m - 45 < 0) {
            if (h - 1 < 0) h = 23;
            else h--;
            m = (m + 15);
        } else {
            m = (m - 45);
        }
        System.out.println(h + " " + m);
    }
}
