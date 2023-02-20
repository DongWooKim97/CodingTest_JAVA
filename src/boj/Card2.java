package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int target = sc.nextInt();
        for (int i = 1; i <= target; i++) {
            q.offer(i);
        }

        int count = 1;
        while (q.size() != 1) {
            if (count % 2 != 0) {
                q.poll();
            } else {
                q.offer(q.poll());
            }
            count++;
        }
        System.out.println(q.poll());
    }
}
