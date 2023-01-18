package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoArrays {

    public static void main(String[] args) {
        CombineTwoArrays c = new CombineTwoArrays();
        Scanner sc = new Scanner(System.in);

        int firstCount = sc.nextInt();
        int[] firstArr = new int[firstCount];

        for (int i = 0; i < firstCount; i++) {
            firstArr[i] = sc.nextInt();
        }

        int secondCount = sc.nextInt();
        int[] secondArr = new int[secondCount];

        for (int i = 0; i < secondCount; i++) {
            secondArr[i] = sc.nextInt();
        }

        for (int x : c.solution(firstCount, secondCount, firstArr, secondArr)) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }
}
