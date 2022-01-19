package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_02_answer {
    /*
    선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
    * */

    public int solution(int cnt, int[] arr){

        int answer = 1, max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max) {
                answer++;
                max = arr[i];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr = new int[cnt];

        Problem02_02_answer p = new Problem02_02_answer();
        for(int i=0; i<cnt; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(p.solution(cnt, arr));
    }
}
