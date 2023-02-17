package inflearn;

import java.util.Scanner;

//선택정렬
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < count - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < count; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }



//        My solve!!!
//        for (int i = 0; i < count-1; i++) {
//            int min = arr[i];
//            int check = 0;
//
//            for (int j = i + 1; j < count; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    check = j;
//                }
//            }
//
//            if(check == 0) continue;
//            else {
//                int tmp = arr[check];
//                arr[check] = arr[i];
//                arr[i] = tmp;
//            }
//        }

        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
