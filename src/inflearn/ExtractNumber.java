package inflearn;

import java.util.Scanner;

public class ExtractNumber {

//    My solve 1
//    public int solution(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) result += str.charAt(i);
//        }
//
//        return Integer.valueOf(result);
//    }

//    My solve 2 -> replace & regex
    public int solution(String str) {
        int answer;
        str = str.replaceAll("[^0-9]","");
        answer = Integer.parseInt(str);
        return answer;

    }

    public static void main(String[] args) {
        ExtractNumber e = new ExtractNumber();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(e.solution(str));
    }
}
