package Problem01;

import java.util.Scanner;

public class Problem01_02 {
    /*
    * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
    * */

    public String solution(String str){
        String answer = "";

        for(char c : str.toCharArray()){ // String을 문자배열로 변경
            if(c == Character.toUpperCase(c)){
                c = Character.toLowerCase(c);
            }else if(c == Character.toLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            answer = answer + c ;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Problem01_02 p = new Problem01_02();
        p.solution(str);
        return ;
    }
}
