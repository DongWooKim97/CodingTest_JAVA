package programmers;

public class FindMrKim {
    class Solution {
        public String solution(String[] seoul) {
            String finding = "Kim";

            int index = 0;
            for(String s : seoul) {

                if(s.equals(finding)) break;
                index++;
            }
            String answer = "김서방은 "+index+"에 있다";
            return answer;
        }
    }
}
