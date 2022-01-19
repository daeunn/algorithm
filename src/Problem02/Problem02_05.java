package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_05 {
    /*
    자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
    * */

    public int solution(int cnt){

        int answer = 1;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=3; i<=cnt; i++) {
            list.add(i);

            for(int j=2; j<i; j++){
                if(i % j == 0) {
                    list.remove(Integer.valueOf(i));
                }
            }
        }

        answer += list.size();

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();

        Problem02_05 p = new Problem02_05();
        System.out.println(p.solution(cnt));
    }
}
