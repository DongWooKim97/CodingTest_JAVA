package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchWord {


//  ArrayList solve
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x: str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        SwitchWord sw = new SwitchWord();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i] = sc.next();
        }
        for(String x : sw.solution(n, str)) {
            System.out.println(x);
        }
    }
//    My solve
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int count = sc.nextInt();
//
//
//        String word;
//        String result;
//        for (int i = 0; i < count; i++) {
//            word = sc.next();
//            result = "";
//            for (int j = word.length() - 1; j >= 0; j--) {
//                result += word.charAt(j);
//            }
//            System.out.println(result);
//        }
//
//
//    }
}
