package inflearn;

import java.util.Scanner;

public class WordsInString {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
//      correct solve!
        WordsInString w = new WordsInString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(w.solution(str));

//        My First Solve -1
//        Scanner sc = new Scanner(System.in);
//        String[] str = sc.nextLine().split(" ");
//
//        String result = "";
//
//        for(int i=0; i<str.length; i++) {
//            if(i == 0) {
//                result = str[i];
//            } else if(str[i].length() > result.length()){
//                result = str[i];
//            }
//        }
//        System.out.println(result);
    }
}
