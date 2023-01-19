package boj;

import java.util.Scanner;

public class Main2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String revA = String.valueOf(a);
        String tmpA = "";
        String revB = String.valueOf(b);
        String tmpB = "";


        for (int i = 2; i >= 0; i--) {
            tmpA += revA.charAt(i);
            tmpB += revB.charAt(i);
        }

        int max = Math.max(Integer.parseInt(tmpA), Integer.parseInt(tmpB));
        System.out.println(max);


    }
}
