package boj;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num != 0) {
            String str = String.valueOf(num);
            boolean check = false;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            num = sc.nextInt();

        }









    }
}
