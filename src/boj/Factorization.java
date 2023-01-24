package boj;

import java.util.Scanner;

public class Factorization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        while (target > 1) {
            for(int i=2;i<=target;i++) {
                if(target % i == 0) {
                    target = target / i;
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
