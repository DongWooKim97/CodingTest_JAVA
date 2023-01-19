package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindSameElements {
    public static void main(String[] args) {
        FindSameElements f = new FindSameElements();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arrA = new int[a];
        for (int i = 0; i < a; i++) {
            arrA[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arrB = new int[b];
        for (int i = 0; i < b; i++) {
            arrB[i] = sc.nextInt();
        }
        for (int x : f.solution(a, b, arrA, arrB)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int a, int b, int[] arrA, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int lt = 0, rt = 0;

        while (lt < a && rt < b) {
            if (arrA[lt] == arrB[rt]) {
                answer.add(arrB[rt]);
                lt++;
                rt++;
            } else if (arrA[lt] < arrB[rt]) {
                lt++;
            } else {
                rt++;
            }
        }

        return answer;
    }
}
