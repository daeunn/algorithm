package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_03 {
    /*
    A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
    두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
    * */

    public String solution(int cnt, int[] aInfo, int[] bInfo){

        String answer = "";

        for(int i=0;i<cnt;i++){
            if(aInfo[i] == bInfo[i]) answer += "D";
            else if(aInfo[i] == 1 && bInfo[i] == 3) answer += "A";
            else if(aInfo[i] == 2 && bInfo[i] == 1) answer += "A";
            else if(aInfo[i] == 3 && bInfo[i] == 2) answer += "A";
            else answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] aInfo = new int[cnt];
        int[] bInfo = new int[cnt];

        Problem02_03 p = new Problem02_03();
        for(int i=0; i<cnt; i++){
            aInfo[i] = in.nextInt();
        }

        for(int i=0; i<cnt; i++){
            bInfo[i] = in.nextInt();
        }

        //** 참고하기
        for(char x : p.solution(cnt,aInfo,bInfo).toCharArray()) System.out.println(x);
        //System.out.println(p.solution(cnt, aInfo, bInfo);
    }
}
