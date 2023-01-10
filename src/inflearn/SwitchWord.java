package inflearn;

import java.util.Scanner;

public class SwitchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();


        String word;
        String result;
        for (int i = 0; i < count; i++) {
            word = sc.next();
            result = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                result += word.charAt(j);
            }
            System.out.println(result);
        }


    }
}
