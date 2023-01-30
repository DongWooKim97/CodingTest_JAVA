package boj;

import java.util.Scanner;

public class EscapeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX = Math.min(w - x, x);
        int minY = Math.min(h - y, y);


        System.out.println(Math.min(minX, minY));

    }
}
