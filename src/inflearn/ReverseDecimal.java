package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDecimal {


    public static void main(String[] args) {
        ReverseDecimal r = new ReverseDecimal();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : r.solution(arr)) {
            System.out.print(x + " ");
        }
    }


    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int item : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(item));
            int rev = Integer.parseInt(sb.reverse().toString());
            boolean check = rev > 1;
            for (int i = 2; i < rev; i++)
                if(rev % i == 0) {
                    check = false;
                    break;
                }
            if (check) list.add(rev);
        }

        return list;
    }

}
