package inflearn;

import java.util.Scanner;

public class Palindrome {
    public String solution(String str) {
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(p.solution(sb.toString()));
    }
}
