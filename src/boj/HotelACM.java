package boj;


import java.util.Scanner;

public class HotelACM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();


        for (int i = 0; i < tc; i++) {
            int[] hotel = new int[3];
            for (int j = 0; j < hotel.length; j++) {
                hotel[j] = sc.nextInt();
            }

            if (hotel[2] % hotel[0] == 0) {
                System.out.println((hotel[0] * 100) + (hotel[2] / hotel[0]));
            } else {
                System.out.println(((hotel[2] % hotel[0]) * 100) + (hotel[2] / hotel[0]) + 1);
            }


        }

    }
}
