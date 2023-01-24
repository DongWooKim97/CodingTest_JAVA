package inflearn;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Password p = new Password();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str = sc.next();

        System.out.println(p.solution(count, str));
    }

    public String solution(int count, String str) {
        String result = "";
        String tmp = "";

        str = str.replaceAll("\\*", "0").replaceAll("#", "1");

        while (str.length() > 0) {
            tmp = str.substring(0, 7);
            str = str.substring(7);
            result += (char) Integer.parseInt(tmp, 2);

        }

        return result;
    }
}
