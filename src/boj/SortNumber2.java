package boj;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


// 시간 문제로 인해 Arrays.sort()불가
// Collections.sort() 해야함

public class SortNumber2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for (int x : list) {
            bw.write(x + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
