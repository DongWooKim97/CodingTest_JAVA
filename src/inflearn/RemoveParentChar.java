package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentChar {
    public String solution(String str) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);
        }

//        for (char x : str.toCharArray()) {
//
//            if (Character.isAlphabetic(x) || x == '(') {
//                stack.push(x);
//            } else {
//                while(stack.pop() != '(');
//            }
//        }
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveParentChar r = new RemoveParentChar();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(r.solution(str));
//        스택 풀이 X
//        String tmp = "";
//
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(!Character.isAlphabetic(str.charAt(i))) {
//                if(str.charAt(i) == '(') sum+=1;
//                else sum-=1;
//            } else {
//                if (sum == 0 && i != 0) {
//                    tmp += str.charAt(i);
//                }
//            }
//        }
//        System.out.println(tmp);
    }
}
//(A(BC)D)EF(G(H)(IJ)K)LM(N)