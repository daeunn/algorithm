package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_01 {
    /*
    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    (첫 번째 수는 무조건 출력한다)
    * */

    public String solution(ArrayList<Integer> list){

        String answer = "";

        for(int i=0; i<list.size(); i++){
            if(i == 0 || list.get(i) > list.get(i-1))  answer += list.get(i) + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        Problem02_01 p = new Problem02_01();
        for(int i=0; i<cnt; i++){
            int input = in.nextInt();
            list.add(input);
        }
        System.out.println(p.solution(list));
    }
}
