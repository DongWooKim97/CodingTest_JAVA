package inflearn;

import java.util.Scanner;

public class FindChar {
    public int solution(String str, char t) {
//        Make UpperCase

        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//      Normal solve
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == t) {
//                answer++;
//            }
//        }

//        enhanced for-loop solve

        for(char c : str.toCharArray()) {
            if(c == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
//        Correct Solution!
        FindChar F = new FindChar();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(F.solution(str, c));

//        My Solution!
//        String[] first = sc.nextLine().toLowerCase().split("");
//        String ch = sc.next().toLowerCase();
//        int count = 0;
//
//        for(String a : first) {
//            if(a.equals(ch)) count+=1;
//        }
//
//        System.out.println(count);

    }
}