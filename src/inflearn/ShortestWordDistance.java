package inflearn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShortestWordDistance {
    //    My Fail solve :(
//    public String solution(String str, String t) {
//        String result = "";
//        int index = str.indexOf(t);
//        int count = 0;
//        int pos = 0;
//        ArrayList<Integer> mid = new ArrayList<>();
//
//        while(index != -1) {
//            mid.add(index);
//            index = str.indexOf(t, index+1);
//        }
//
//        System.out.println(mid);
//
//        for(int i=0; i<str.length(); i++) {
//            if(mid.get(count) != i) {
//                if(mid.get(count) - pos <  mid.get(count+1) - pos ) {
//                    pos = mid.get(count) - i;
//                } else {
//                    pos = mid.get(count+1) -i;
//                    count++;
//                }
//
//                result += (pos + " ");
//            } else {
//                result += (0 + " ");
//                count++;
//
//            }
//        }
//
//
//        return result;
//    }
    public int[] solution(String s, char t) {
        int[] ans = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            ans[i] = p;
        }

        for(int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                ans[i] = Math.min(ans[i], p);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        ShortestWordDistance s = new ShortestWordDistance();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);


        for(int x : s.solution(str, t)) {
            System.out.print(x+" ");
        }
    }
}
