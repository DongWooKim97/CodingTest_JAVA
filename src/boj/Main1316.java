package boj;


import java.util.Scanner;

public class Main1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int count = sc.nextInt();
        String[] strArr = new String[count];

        for (int i = 0; i < count; i++) {
            strArr[i] = sc.next();
        }

        for (int i = 0; i < count; i++) {
            StringBuilder tmp = new StringBuilder();
            boolean check = true;

            for (int j = 0; j < strArr[i].length(); j++) {
                if (!tmp.toString().contains(String.valueOf(strArr[i].charAt(j)))) {
                    tmp.append(strArr[i].charAt(j));
                } else {
                    if (strArr[i].charAt(j - 1) != strArr[i].charAt(j)) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) answer++;
        }
        System.out.println(answer);
    }
}
