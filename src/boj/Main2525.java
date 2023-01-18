package boj;

import java.util.Scanner;

public class Main2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int need = sc.nextInt();

        int min = 60 * h + m + need;

        int resultH = (min / 60) % 24;
        int resultM = min % 60;

//        My Failed Solve :(
//        if (m + need > 60) {
//            int exceedH = (m + need) / 60;
//
//            if (h + exceedH >= 24) {
//                h = (h + exceedH) % 24;
//                m = (m + need) % 60;
//            } else {
//                h = h + exceedH;
//                m = (m + need) % 60;
//            }
//        } else {
//            m += need;
//        }

        System.out.print(resultH + " " + resultM);
    }
}
