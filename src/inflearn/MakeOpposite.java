package inflearn;

import java.util.Scanner;

public class MakeOpposite {
    public String init(String s) {
//      video solve - ascii & casting
        String answer = "";
        for(char x : s.toCharArray()) {
            if(x>=65 && x<=90) answer += (char)(x+32);
            else answer += (char)(x-32);
        }
        return answer;

//        My second solve -StringBuilder
//        StringBuilder sb = new StringBuilder();
//        for(char x : s.toCharArray()) {
//            if(Character.isLowerCase(x)) {
//                sb.append(Character.toUpperCase(x));
//            } else {
//                sb.append(Character.toLowerCase(x));
//            }
//        }
//
//        return sb.toString();



//        My first solve

//        int index = 0;
//        String upCase = s.toUpperCase();
//        String lowCase = s.toLowerCase();
//        String result = "";
//
//        for(char c : s.toCharArray()) {
//          if(c == upCase.charAt(index)) {
//              result += lowCase.charAt(index);
//          } else{
//              result += upCase.charAt((index));
//          }
//          index++;
//        }

//        return result;
    }
    public static void main(String[] args) {
        MakeOpposite m = new MakeOpposite();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(m.init(str));
    }
}
