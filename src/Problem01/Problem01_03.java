package Problem01;

import java.util.Scanner;

public class Problem01_03 {

    /*
    * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    * 문장속의 각 단어는 공백으로 구분됩니다.
    * */

    public String solution(String str){
        String answer = "";
        String arr[] = str.split(" ");
        int len = 0;

        for(String s : arr){
            if(len < s.length()){
                len = s.length();
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Problem01_03 p = new Problem01_03();
        System.out.println(p.solution(str));
    }
}
