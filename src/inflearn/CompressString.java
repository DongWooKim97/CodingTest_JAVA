package inflearn;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {

        CompressString c = new CompressString();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(c.solution(str));
    }

    public String solution(String str) {
        String result = "";
        str += " ";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i);
                if (count > 1) {
                    result += String.valueOf(count);
                }
                count = 1;
            }
        }


        return result;
    }

}
