package Problem01;

import java.util.Scanner;

public class Problem01_06 {
    /* 꼭 다시 풀어보기!!
    * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
    * */

    public String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Problem01_06 p = new Problem01_06();
        System.out.println(p.solution(input));
    }
}
