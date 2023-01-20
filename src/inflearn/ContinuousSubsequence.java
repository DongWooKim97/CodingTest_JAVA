package inflearn;

import java.util.Scanner;

public class ContinuousSubsequence {

    public int solution(int count, int target, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < count; rt++) {
            sum += arr[rt];
            if (sum == target) answer++;
            while (sum >= target) {
                sum -= arr[lt++];
                if (sum == target) answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequence c = new ContinuousSubsequence();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(c.solution(count, target, arr));

//        나의 실패한 코드 ..!!
//        int lt = 0, rt = 0, sum = 0, answer = 0;
//        int count = sc.nextInt();
//        int target = sc.nextInt();
//        int[] arr = new int[count];
//
//        for (int i = 0; i < count; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        while (rt < count) {
//            if (sum == target) {
//                answer++;
//                sum -= arr[lt++];
//            } else if (sum < target) {
//                sum += arr[rt++];
//            } else {
//                sum -= arr[lt++];
//            }
//        }
//
//        while(lt < count) {
//            sum -= arr[lt++];
//            if(sum == target) {
//                answer++;
//            }
//            if(sum < target) break;
//        }
    }


}