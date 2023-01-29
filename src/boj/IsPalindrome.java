package boj;

import java.util.Scanner;

public class IsPalindrome {
    static int result;
    public static void main(String[] args) {
        IsPalindrome is = new IsPalindrome();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(is.solution(sc.next()) + " " + result);
        }

    }

    public int solution(String str) {
        result = 0;
        return recursion(str, 0, str.length() - 1);
    }

    public int recursion(String str, int l, int r) {
        result++;
        if (l >= r) return 1;
        else if (str.charAt(l) != str.charAt(r)) return 0;
        else return recursion(str, l + 1, r - 1);

    }
}
