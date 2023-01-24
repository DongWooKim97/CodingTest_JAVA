package boj;

import java.util.Scanner;

//BOJ 4948 베그트랑 공준
//https://www.acmicpc.net/problem/4948
public class BertrandsPostulate {

    public static void main(String[] args) {
        BertrandsPostulate b = new BertrandsPostulate();
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();
        while (in != 0) {
            System.out.println(b.solution(in));
            in = sc.nextInt();
        }
    }

    public int solution(int num) {
        int count = 0;
        int num2 = num * 2;
        boolean[] prime = new boolean[num2 + 1];
        prime[0] = prime[1] = true;

        if (num < 1) return 0;
        if (num == 1) return 1;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {

            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for (int i = num+1; i <= num2; i++) {
            if(!prime[i]) count++;
        }
        return count;
    }

}
