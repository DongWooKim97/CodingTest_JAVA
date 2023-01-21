package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbSnail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int up = Integer.parseInt(str[0]);
        int down = Integer.parseInt(str[1]);
        int height = Integer.parseInt(str[2]);

        int day = (height - down) / (up - down);

        if ((height - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
