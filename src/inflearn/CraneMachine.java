package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class CraneMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int size = sc.nextInt();
        int[][] board = new int[size][size];
        Stack<Integer> stack = new Stack<>();

        //make 2D array for board
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        //make moves Array
        int cnt = sc.nextInt();
        int[] moves = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            moves[i] = sc.nextInt();
        }
        // let's check for board
        for (int move : moves) {
            int tmp = -1;
            for (int j = size - 1, k = move - 1; j >= 0; j--) {
                if (board[j][k] != 0) {
                    tmp = board[j][k];
                    board[j][k] = 0;
                    break;
                }
            }
            if (tmp != -1) {
                if (stack.size() != 0 && tmp == stack.peek()) {
                    stack.pop();
                    result++;
                } else {
                    stack.push(tmp);
                }
            } 


        }
        // pop한 결과 + board에서 꺼낸 숫자  = 2배
        System.out.println(result * 2);
    }
}
