package Problem01;

import java.util.Scanner;

public class Problem01_10_answer {
    /*
    첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
    문자열의 길이는 100을 넘지 않는다.
    * */

    public int[] solution(String s, char t){

        int[] answer = new int[s.length()];
        int p = 1000;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == t) p = 0;
            else{
                p++;
              //  answer[i] = Math.min(answer[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char c = in.next().charAt(0);

        Problem01_10_answer p = new Problem01_10_answer();
        for(int x : p.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
