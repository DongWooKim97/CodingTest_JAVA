package boj;

import java.util.Scanner;

public class SugarDelivery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kg = sc.nextInt();
        int count = 0;

        while (true) {
            if (kg % 5 == 0) {
                count += (kg / 5);
                break;
            }

            kg -= 3;
            count++;

            if (kg < 0) {
                count = -1;
                break;
            }

        }


        System.out.println(count);
    }
}
