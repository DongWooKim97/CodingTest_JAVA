package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12943?language=java
// LV1 콜라추의 추측

class Collatz {
    public int solution(int num) {
        long n = num;
        if(num == 1) return 0;

        int count=0;

        while(n != 1) {
            if(n % 2 ==0) {
                n /= 2;
            }  else {
                n = ( n * 3 ) +1;
            }
            count++;

            if(count >= 500) return -1;
        }

        return count;
    }


}