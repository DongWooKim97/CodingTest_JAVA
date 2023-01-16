package inflearn;

import java.util.Scanner;

public class VisibleStudents {
    public int solution(int total, int[] stu) {
//        My Fail solve!
//        int count = 0;
//        for (int i = 0; i < total - 1; i++) {
//            if (stu[i + 1] > stu[i]) {
//                count++;
//            }
//        }

//        int count = 1;
//        int tmp = stu[0];
//
//        for (int i = 1; i < total; i++) {
//            if(tmp <= stu[i]) {
//                count++;
//                tmp = stu[i];
//            }
//        }
        int count = 1;
        int tmp= stu[0];
        for(int i=1; i<total; i++) {
            if(tmp < stu[i]) {
                count++;
                tmp = stu[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        VisibleStudents v = new VisibleStudents();
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int[] stu = new int[total];

        for (int i = 0; i < total; i++) {
            stu[i] = sc.nextInt();
        }

        System.out.println(v.solution(total, stu));
    }
}
