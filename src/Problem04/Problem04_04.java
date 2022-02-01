package Problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem04_04 {

    public  int solution(String s, String t){
        int answer = 0;
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character x : t.toCharArray()){
            map2.put(x, map2.getOrDefault(map2.get(x), 0)+1);
        }


        for(Character c : s.toCharArray()){
           list.add(c);
        }

        for(int i=0; i<t.length()-1; i++){
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
        }


        int lt=0;
        int cnt=0;
        for(int rt=t.length()-1; rt<s.length() ; rt++){
            map.put(list.get(rt), map.getOrDefault(list.get(rt), 0)+1);

            if(rt==8) map.keySet().stream().forEach(System.out::println);

            for(Character x : map.keySet()){
                if(map.get(x).equals(map2.get(x))){
                    cnt ++;
                }
            }

            if(cnt == t.length()) answer++;

            map.put(list.get(lt), map.get(list.get(lt))-1);
            if(map.get(list.get(lt))==0){ map.remove(list.get(lt));}
            lt++;
            cnt = 0;
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        Problem04_04 p = new Problem04_04();
        System.out.println(p.solution(s,t));
    }
}
