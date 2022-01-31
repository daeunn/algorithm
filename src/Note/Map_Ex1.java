package Note;

import java.util.HashMap;
import java.util.Map;

public class Map_Ex1 {
    public  static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();

        // Map에 데이터 추가
        map.put( 1, "apple");
        map.put( 4, "pineapple");
        map.put( 2, "orange");
        map.put( 5, "strawberry");
        map.put( 3, "melon");

        // for문
        for(int x : map.keySet()){
            System.out.println("[key]:"+x + ",[value]:"+map.get(x));
        }

        System.out.println("-----------------------------------------");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("[key]:"+entry.getKey() + ",[value]:"+entry.getValue());
        }

        System.out.println("-----------------------------------------");

        map.forEach((key,value) -> System.out.println("[key]:"+key+",[value]"+value));

        System.out.println("-----------------------------------------");

        map.keySet().stream().forEach(System.out::println);

    }
}
