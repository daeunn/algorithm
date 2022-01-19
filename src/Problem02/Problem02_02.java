package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_02 {
    /*
    선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
    * */

    public int solution(ArrayList<Integer> list){

        int answer = 1;

        for(int i=1; i<list.size(); i++){
            if(i!=1 && list.get(i-1) < list.get(i))  answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        Problem02_02 p = new Problem02_02();
        for(int i=0; i<cnt; i++){
            int input = in.nextInt();
            list.add(input);
        }
        System.out.println(p.solution(list));
    }
}
