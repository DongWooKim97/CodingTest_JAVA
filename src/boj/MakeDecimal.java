package boj;

import java.util.Scanner;

public class MakeDecimal {

    static boolean[] prime;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        prime = new boolean[end + 1];
        make_prime();

        for(int i=start;i<=end;i++) {
            if(!prime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void make_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }


    }
}
