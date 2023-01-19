package boj;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

    }
}
