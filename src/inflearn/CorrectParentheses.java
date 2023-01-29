package inflearn;

import java.util.Scanner;

public class CorrectParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') sum += 1;
            else sum -= 1;
        }

        if (sum == 0 && str.charAt(0) != ')' && str.charAt(str.length() - 1) != '(') System.out.println("YES");
        else System.out.println("NO");
    }
}
