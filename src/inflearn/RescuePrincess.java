package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RescuePrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= size; i++) {
            q.add(i);
        }

        while (q.size() != 1) {
            for (int i = 0; i < target - 1; i++) {
                q.add(q.poll());
            }
            q.remove();
        }

        System.out.println(q.poll());


    }
}