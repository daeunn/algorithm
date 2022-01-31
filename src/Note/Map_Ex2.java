package Note;

import javax.print.attribute.IntegerSyntax;
import java.security.KeyStore;
import java.util.*;

public class Map_Ex2 {
    public  static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();

        // Map에 데이터 추가
        map.put( 1, "apple");
        map.put( 4, "pineapple");
        map.put( 2, "orange");
        map.put( 5, "strawberry");
        map.put( 3, "melon");

        // key순으로 정렬
        Object[] keyMap = map.keySet().toArray();
        Arrays.sort(keyMap);

        for(int x : map.keySet()){
            System.out.println(x +","+map.get(x));
        }

        // Map에 데이터 추가
        map.put( 1, "apple");
        map.put( 4, "pineapple");
        map.put( 2, "orange");
        map.put( 5, "strawberry");
        map.put( 3, "melon");

        // value순으로 정렬
        List<Map.Entry<Integer, String>> entryList = new LinkedList<>(map.entrySet());
        /*entryList.sort(Map.Entry.comparingByValue());
        for(Map.Entry<Integer, String> entry : entryList){
            System.out.println(entry.getKey()+","+entry.getValue());
        }*/

        entryList.stream().map(Map.Entry::getKey).forEach(System.out::println);
    }
}
