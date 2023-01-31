package inflearn;


import java.util.Scanner;

public class ShortestWordDistance {
    public static void main(String[] args) {
        ShortestWordDistance s = new ShortestWordDistance();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        for (int x : s.solution(str, t)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String str, char t) {
        int[] arr = new int[str.length()];
        int tmp = 1000;

        for (int i = 0; i < arr.length; i++) {
            if (str.charAt(i) == t) {
                tmp = 0;
                arr[i] = tmp;
            } else {
                tmp++;
                arr[i] = tmp;
            }
        }

        tmp = 1000;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                tmp = 0;
                arr[i] = tmp;
            } else {
                tmp++;
                arr[i] = Math.min(arr[i], tmp);
            }
        }

        return arr;
    }
}
