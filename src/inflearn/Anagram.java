package inflearn;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Anagram a = new Anagram();
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

//        My Solve!!
//        char[] s1 = sc.nextLine().toCharArray();
//        char[] s2 = sc.nextLine().toCharArray();
//
//        Arrays.sort(s1);
//        Arrays.sort(s2);

        System.out.println(a.solution(s1, s2));
    }

    public String solution(String s1, String s2) {
//        String answer = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return "YES";


//        My Solve!!
//        method parameter = char[] s1, char[] s2
//        Map<Character, Integer> h1 = new TreeMap<>();
//        Map<Character, Integer> h2 = new TreeMap<>();
//
//        for(char x: s1) {
//            h1.put(x, h1.getOrDefault(x, 0)+1);
//        }
//        for(char x: s2) {
//            h2.put(x, h2.getOrDefault(x, 0)+1);
//        }
//
//        if(h1.toString().equals(h2.toString())) {
//            answer += "YES";
//        } else {
//            answer += "NO";
//        }

//        return answer;
    }
}

