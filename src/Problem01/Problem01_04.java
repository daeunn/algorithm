package Problem01;

import java.util.Scanner;

public class Problem01_04 {

    public String solution(String[] str){
        String answer = "";

        for(String s : str){
            for(int i=s.length(); i>0; i--) {
                answer += s.charAt(i - 1);
            }
            System.out.println(answer);
            answer = "";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        String str = "";
        String arr[] = new String[cnt];

        for(int i=0; i<cnt; i++) {
            str = in.next();
            arr[i] = str;
        }

        Problem01_04 p = new Problem01_04();
        p.solution(arr);
    }
}
