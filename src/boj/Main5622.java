package boj;

import java.util.Scanner;

public class Main5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        
//        나의 1차원적이고 비효율적인 답안
        
        int spare = str.length();

        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 67) {
                spare += 2;
            } else if ((int) str.charAt(i) >= 68 && (int) str.charAt(i) <= 70) {
                spare += 3;
            } else if ((int) str.charAt(i) >= 71 && (int) str.charAt(i) <= 73) {
                spare += 4;
            } else if ((int) str.charAt(i) >= 74 && (int) str.charAt(i) <= 76) {
                spare += 5;
            } else if ((int) str.charAt(i) >= 77 && (int) str.charAt(i) <= 79) {
                spare += 6;
            } else if ((int) str.charAt(i) >= 80 && (int) str.charAt(i) <= 83) {
                spare += 7;
            } else if ((int) str.charAt(i) >= 84 && (int) str.charAt(i) <= 86) {
                spare += 8;
            } else if ((int) str.charAt(i) >= 87 && (int) str.charAt(i) <= 90) {
                spare += 9;
            }
        }

        System.out.println(spare);


    }
}
