package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_04 {
    /*
    1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    * */

    public int[] solution(int cnt){

        int[] answer = new int[cnt];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<cnt; i++) {
            if (cnt <= 45) {
                answer[i] = answer[i-1] + answer[i-2];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();

        Problem02_04 p = new Problem02_04();
        for(int i : p.solution(cnt)){
            System.out.print(i + " ");
        }
    }
}
