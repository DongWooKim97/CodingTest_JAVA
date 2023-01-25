package inflearn;

import java.util.Scanner;

public class Eratosthenes {

    static boolean[] prime;

    public static void main(String[] args) {
        Eratosthenes e = new Eratosthenes();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        System.out.println(e.solution(count));

    }

    public int solution(int count) {
        int result = 0;
        prime = new boolean[count + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for(int i=2;i<=count;i++) {
            if(!prime[i]) result++;
        }


        return result;
    }
}
