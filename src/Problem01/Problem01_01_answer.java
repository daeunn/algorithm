package Problem01;

import java.util.Scanner;

public class Problem01_01_answer {
    /*
     * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
     * */
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){  // toCharArray : 문자열을 char형 배열로 바꿔준다.
            if(x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Problem01_01_answer T = new Problem01_01_answer();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); // String의 index

        System.out.println(T.solution(str, c));
    }
}
