package boj;

import java.util.Scanner;

public class MovieDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 666;
        int count = 0;


        while (true) {
            String tmp = String.valueOf(start);
            if (tmp.contains("666")) {
                count++;
            }
            start++;
            if (num == count) {
                System.out.println(tmp);
                break;
            }
        }
    }
}
