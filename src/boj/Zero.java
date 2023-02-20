package boj;

import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int call = sc.nextInt();

        for (int i = 0; i < call; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        int sum = 0;
        for (int x : stack) {
            sum += x;
        }
        System.out.println(sum);
    }
}
