package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GridMaxSum {

    public static void main(String[] args) {
        GridMaxSum g = new GridMaxSum();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[][] grid = new int[count][count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(g.solution(count, grid));
    }

    public int solution(int count, int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();

        int tmpDLeft = 0;
        int tmpDRight = 0;
        for (int i = 0; i < count; i++) {
            int tmpH = 0;
            int tmpV = 0;
            for (int j = 0; j < count; j++) {
                tmpH += grid[i][j];
                tmpV += grid[j][i];
            }
            tmpDLeft += grid[i][i];
            tmpDRight += grid[i][count - 1 - i];
            list.add(tmpH);
            list.add(tmpV);
        }
        list.add(tmpDLeft);
        list.add(tmpDRight);
        list.add(tmpDRight);



        return Collections.max(list);
    }
}
