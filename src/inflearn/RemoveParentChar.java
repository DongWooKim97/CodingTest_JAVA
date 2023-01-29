package inflearn;

import java.util.Scanner;

public class RemoveParentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String tmp = "";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isAlphabetic(str.charAt(i))) {
                if(str.charAt(i) == '(') sum+=1;
                else sum-=1;
            } else {
                if (sum == 0 && i != 0) {
                    tmp += str.charAt(i);
                }
            }
        }
        System.out.println(tmp);
    }
}
//(A(BC)D)EF(G(H)(IJ)K)LM(N)