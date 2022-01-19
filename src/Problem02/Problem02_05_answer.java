package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_05_answer {
    /*
    자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
    * */

    public int solution(int cnt){
        int answer = 0;
        int[] ch = new int[cnt+1]; //처음에 0으로 초기화

        for(int i=2;i<=cnt;i++){
            if(ch[i]==0) {
                answer++;

                for(int j=ch[i]; j<=cnt; j=j+i){ /*배수만큼 증가했을때 없애기*/
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();

        Problem02_05_answer p = new Problem02_05_answer();
        System.out.println(p.solution(cnt));
    }
}
