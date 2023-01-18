package boj.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double arr[] = new double[sc.nextInt()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        double sum = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        System.out.println(sum / arr.length);


    }

}
