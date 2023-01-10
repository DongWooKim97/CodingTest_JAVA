package inflearn;

import java.util.Scanner;

public class MakeOpposite {
    public String init(String s) {
        int index = 0;
        String upCase = s.toUpperCase();
        String lowCase = s.toLowerCase();
        String result = "";

        for(char c : s.toCharArray()) {
          if(c == upCase.charAt(index)) {
              result += lowCase.charAt(index);
          } else{
              result += upCase.charAt((index));
          }
          index++;
        }

        return result;
    }
    public static void main(String[] args) {
        MakeOpposite m = new MakeOpposite();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(m.init(str));
    }
}
