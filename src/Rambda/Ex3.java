package Rambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream().forEach(System.out::print);
        System.out.println();
        list.stream().filter(i->i>2).forEach(System.out::print);
        System.out.println();

        String[] abc = {"a","b","c"};
        Stream<String> stream = Arrays.stream(abc);
        stream.forEach(System.out::print);
       //  stream.forEach(System.out::println); // 최종연산 2번하는 경우 오류
    }
}
