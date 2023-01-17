package inflearn;

import java.util.Scanner;

public class PeakAreaVer2 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        PeakAreaVer2 p = new PeakAreaVer2();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(p.solution(size, arr));
    }

    public int solution(int size, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < size && ny >= 0 && ny < size && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }
}
