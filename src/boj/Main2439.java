package boj;

import java.util.Scanner;

public class Main2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();

        String result;
        int ans;

        for(int i=1; i<=count; i++) {
            ans = count - i;
            result = "";

//            for(int j=0; j<ans; j++) {
//                result += " ";
//            }
            result += " ".repeat(ans);
            result += "*".repeat(i);

            System.out.println(result);
        }



    }
}
