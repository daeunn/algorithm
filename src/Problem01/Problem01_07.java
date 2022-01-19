package Problem01;

import java.util.Scanner;

public class Problem01_07 {
    /*
    * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    * 단 회문을 검사할 때 대소문자를 구분하지 않습니다
    * */

    public String solution(String str){
        String answer = "";

        String tmp = new StringBuilder(str).reverse().toString();
        if(tmp.toUpperCase().equals(str.toUpperCase())) answer = "YES";
        else answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Problem01_07 p = new Problem01_07();
        System.out.println(p.solution(input));
    }
}
