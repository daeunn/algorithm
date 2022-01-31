package Problem04;

import Problem03.Problem03_06;
import org.codehaus.groovy.util.HashCodeHelper;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04_01 {

    public char solution(int n, String str){
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x : map.keySet()){

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


        Problem04_01 p = new Problem04_01();
        System.out.print(p.solution(n, str));

    }
}
