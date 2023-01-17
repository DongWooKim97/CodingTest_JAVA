package inflearn;

import java.util.*;

public class ReverseDecimal {
    public boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i<num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp >0) {
                int t = tmp % 10;
                res = res *  10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseDecimal r = new ReverseDecimal();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<count; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : r.solution(count, arr)) {
            System.out.print(x+" ");
        }
    }

//    My Fail Solve :(
//    public boolean sieve(String tmp) {
//        int answer = Integer.parseInt(tmp);
//        if (answer < 2) {
//            return false;
//        }
//
//        for (int i = 2; i <= (int) Math.sqrt(answer); i++) {
//            if (answer % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public String solution(int x) {
//        int answer = 0;
//
//        String rev = Integer.toString(x);
//        String tmp = "";
//
//        for (int i = rev.length() - 1; i >= 0; i--) {
//            if (rev.charAt(i) != '0' ) {
//                tmp += rev.charAt(i);
//            }
//        }
//
//        return sieve(tmp) ? tmp : null;
//    }
//
//    public static void main(String[] args) {
//        ReverseDecimal r = new ReverseDecimal();
//        Scanner sc = new Scanner(System.in);
//
//        int count = sc.nextInt();
//        int[] arr = new int[count];
//
//        for (int i = 0; i < count; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int x : arr) {
//            if (!(r.solution(x) ==null) ) {
//                System.out.print(r.solution(x) + " ");
//            }
//
//        }
//    }
}
