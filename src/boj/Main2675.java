package boj;

import java.util.Scanner;

public class Main2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
//        첫 시도! - 성공
//        for (int i = 0; i < tc; i++) {
//            int count = sc.nextInt();
//            char[] ch = sc.next().toCharArray();
//            String tmp = "";
//            for (int j = 0; j < ch.length; j++) {
//                for(int k=0; k<count; k++) {
//                    tmp+=ch[j];
//                }
//            }
//            System.out.println(tmp);
//        }

//      두번째 시도 ! - 성공 --> 첫 시도 < 두번째 시도 (효율성 및 메모리)
        for (int i = 0; i < tc; i++) {
            int count = sc.nextInt();
            String str = sc.next();
            String tmp = "";
            for(int j=0; j<str.length(); j++) {
                tmp += String.valueOf(str.charAt(j)).repeat(count);
            }
            System.out.println(tmp);
        }


    }
}
