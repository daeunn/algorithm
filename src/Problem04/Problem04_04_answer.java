package Problem04;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04_04_answer {

    public  int solution(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : t.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }

        for(int i=0; i<t.length()-1; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        int lt=0;
        for(int rt=t.length()-1; rt<s.length() ; rt++){
            map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0)+1);

            if(map.equals(map2)) answer++; // map끼리 equals가능!!

            map.put(s.charAt(lt), map.get(s.charAt(lt))-1);
            if(map.get(s.charAt(lt))==0){ map.remove(s.charAt(lt));}
            lt++;
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        Problem04_04_answer p = new Problem04_04_answer();
        System.out.println(p.solution(s,t));
    }
}
