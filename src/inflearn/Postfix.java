package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    static Character add = '+';
    static Character minus = '-';
    static Character mul = '*';
    static Character sub = '/';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> starStack = new Stack<>();

        for (char c : str) {
            if (Character.isDigit(c)) {
                numStack.push(Character.getNumericValue(c));
            } else {
                int p1 = numStack.pop();
                int p2 = numStack.pop();

                int mid = check(p2, p1, c);
                numStack.push(mid);
            }
            System.out.println(numStack);
        }
        int result = numStack.pop();

        System.out.println(result);
    }

    public static int check(int n1, int n2, Character c) {
        if (c == add) {
            return n1 + n2;
        } else if (c == minus) {
            return n1 - n2;
        } else if (c == mul) {
            return n1 * n2;
        } else {
            return n1 / n2;
        }
    }


}
