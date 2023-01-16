package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNum {
    public ArrayList<Integer> solution(int target, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<target; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        PrintBigNum p = new PrintBigNum();
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int[] arr = new int[target];

        for(int i=0; i<target;i++) {
            arr[i] = sc.nextInt();
        }

        for(int x: p.solution(target, arr)) {
            System.out.print(x+" ");
        }
    }
}
