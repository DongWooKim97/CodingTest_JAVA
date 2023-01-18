package boj;

public class Main4673 {
    public static void main(String[] args) {
        int max = 10000;
        boolean[] check = new boolean[max +1];

        for(int i=1; i<max+1; i++) {
            int n = d(i);

            if(n < 10001) {
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<max+1; i++) {
            if(!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int num) {
        int sum = num;
        while(num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }
}
