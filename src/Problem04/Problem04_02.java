package Problem04;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04_02 {

    public String solution(String str1, String str2){
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char a : str1.toCharArray()){
            map1.put(a, map1.getOrDefault(a, 0)+1);
        }

        for(char b : str2.toCharArray()){
            map2.put(b, map2.getOrDefault(b, 0)+1);
        }

        for(char x : map1.keySet()) {
            // System.out.println(x +"," + map1.get(x) +"," + map2.get(x));
            if(map2.get(x) != map1.get(x)){
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();


        Problem04_02 p = new Problem04_02();
        System.out.print(p.solution(str1, str2));

    }
}
