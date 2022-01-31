package Rambda;

import java.util.ArrayList;
import java.util.List;

//collection.forEach(변수 -> 반복처리(변수))
public class Ex1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("p");
        list.add("p");
        list.add("l");
        list.add("e");

        // 확장 for문
        System.out.println("확장 for문 출력");
        for (String s : list) {
            System.out.println(s);
        }

        // forEach 함수
        System.out.println("forEach 함수 출력");
        list.forEach(s-> System.out.println(s));
    }
}
