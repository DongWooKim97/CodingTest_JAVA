package inflearn;

import java.util.Scanner;

public class FindChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().toLowerCase().split("");
        String ch = sc.next().toLowerCase();
        int count = 0;

        for(String a : first) {
            if(a.equals(ch)) count+=1;
        }

        System.out.println(count);

    }
}