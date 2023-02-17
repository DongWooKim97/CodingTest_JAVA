package inflearn;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

//        마지막으로 돌 인덱스의 값은 비교를 할 필요가 없기에 count -1 만큼 루프
        for (int i = 0; i < count - 1; i++) {
//         루프를 돌 때 마다 (i가 증가할 때마다) 비교를 할 필요가 없기에 count - i - 1 만큼 비교 루프
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

//        My Solve!!
//        for (int i = 0; i < count; i++) {
//            for (int j = 0; j < count - 1; j++) {
//                if (arr[j + 1] < arr[j]) {
//                    int tmp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
