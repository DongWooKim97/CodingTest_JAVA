package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        String str = sc.next();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }
        System.out.println(answer);
    }
}
