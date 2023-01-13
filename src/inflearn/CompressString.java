package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class CompressString {

    public String solution(String str) {
//        My Fail solve :(
//        String result = "";
//        String tmp = "";
//        int count = 1;
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i) != str.charAt(i - 1)) {
//                if (count == 1) {
//                    result += (str.charAt(i - 1));
//
//                } else {
//                    result += (str.charAt(i - 1) + count);
//                }
//
//                count = 1;
//            } else {
//                count++;
//            }
//        }

        String answer = "";
        str = str + " ";

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer+= str.charAt(i);
                if(count>1) {
                    answer += String.valueOf(count);
                }
                count = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        CompressString c = new CompressString();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(c.solution(str));


    }
}
