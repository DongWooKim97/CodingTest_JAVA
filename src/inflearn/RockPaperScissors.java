package inflearn;

import java.util.Scanner;

public class RockPaperScissors {

    public String solution(int count, int[] a, int[] b) {
        String result = "";
//        switch (a) {
//            case 1:
//                if (b == 1) {
//                    result =  "D";
//                } else if (b == 2) {
//                    result =  "B";
//                } else {
//                    result =  "A";
//                }
//                break;
//
//            case 2:
//                if (b == 1) {
//                    result =  "A";
//                } else if (b == 2) {
//                    result =  "D";
//                } else {
//                    result =  "B";
//                }
//                break;
//
//            case 3:
//                if (b == 1) {
//                    result =  "B";
//                } else if (b == 2) {
//                    result =  "A";
//                } else {
//                    result =  "D";
//                }
//                break;
//
//        }

        for (int i = 0; i < count; i++) {
            if (a[i] == b[i]) result += "D";
            else if (a[i] == 1 && b[i] == 3) result += "A";
            else if (a[i] == 2 && b[i] == 1) result += "A";
            else if (a[i] == 3 && b[i] == 2) result += "A";
            else result += "B";
        }
        return result;
    }

    public static void main(String[] args) {
        RockPaperScissors r = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] playerA = new int[count];
        int[] playerB = new int[count];

        for (int i = 0; i < count; i++) {
            playerA[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            playerB[i] = sc.nextInt();
        }

//        for (int i = 0; i < count; i++) {
//            System.out.println(r.solution(playerA[i], playerB[i]));
//        }

        for (char x : r.solution(count, playerA, playerB).toCharArray()) {
            System.out.println(x);
        }

    }
}
