package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String need = sc.next();
        String design = sc.next();

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        for (char c : design.toCharArray()) {
            q2.add(c);
        }

        for (char c : need.toCharArray()) {
            q1.add(c);
        }

        int count = 0;
        while (count <= 100) {
            if (q2.peek() == q1.peek()) {
                q2.offer(q2.poll());
                q1.remove();
            } else {
                q2.offer(q2.poll());
            }
            count++;
        }

        if (count != 100 && q1.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
