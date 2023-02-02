package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {

    public String solution(String str) {
        String result = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) result = "NO";

        return result;
    }

    public static void main(String[] args) {
        CorrectParentheses c = new CorrectParentheses();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(c.solution(str));


//        스택 사용X 풀이 - !
//        int sum = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '(') sum += 1;
//            else sum -= 1;
//        }
//
//        if (sum == 0 && str.charAt(0) != ')' && str.charAt(str.length() - 1) != '(') System.out.println("YES");
//        else System.out.println("NO");


    }
}
