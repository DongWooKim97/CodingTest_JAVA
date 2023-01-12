package inflearn;

import java.util.Scanner;

public class RotateString {

    public static String CORRECT = "YES";
    public static String INCORRECT = "NO";

    public String solution(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
//            left += str.charAt(i);
//            right += str.charAt(str.length() - i - 1);
            if(str.charAt(i) != str.charAt(str.length() -1 -i)) return INCORRECT;
        }
        return CORRECT;




    }

    public static void main(String[] args) {
        RotateString rs = new RotateString();
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
        System.out.println(rs.solution(str));

    }
}

