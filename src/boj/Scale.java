package boj;

import java.util.Scanner;

public class Scale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String as = "12345678";
        String des = "87654321";
        String result = "";

        int len = 8;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            result += String.valueOf(x);
        }

        if (result.equals(as)) {
            System.out.println("ascending");
        } else if (result.equals(des)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }




    }
}
