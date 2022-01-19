package Problem01;

import java.util.Scanner;

public class Problem01_02_answer {

    public String solution(String str){
        String answer = "";

        for(char c : str.toCharArray()){ // ** String을 문자배열로 변경
            /* 1.isLowerCase
                if(Character.isLowerCase(c)) answer += Character.toUpperCase(c); // **isLowerCase
                else answer += Character.toLowerCase(c);
            */

            /*  아스키코드
                대문자:65-90/소문자:91-122), 대소문자 32차이
            */
            if(c>=97 && c<=122) answer += (char)(c-32);
            else answer += (char)(c+32);

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Problem01_02_answer p = new Problem01_02_answer();
        System.out.println(p.solution(str));
    }
}
