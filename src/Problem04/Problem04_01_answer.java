package Problem04;

import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem04_01_answer {

    public char solution(int n, String str){
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
//
//        System.out.println(map.containsKey('F')); // false
//        System.out.println(map.size()); // 5
//        System.out.println(map.remove('A')); // A 삭제
//        System.out.println(map.size()); // 4

       /* for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +"," + entry.getValue());
        }*/

        map.entrySet().stream().forEach(entry->
                System.out.println(entry.getKey()+","+entry.getValue()));

        for(char x : map.keySet()){ // map 객체 탐색
            if(map.get(x)>max){
                max=map.get(x);
                answer = x;
            }
        }


        return answer;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        Problem04_01_answer p = new Problem04_01_answer();
        System.out.print(p.solution(n, str));
    }
}
