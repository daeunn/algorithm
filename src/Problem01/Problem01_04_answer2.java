package Problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01_04_answer2 {

    /*
    * 문자열교환 (1번째<->마지막, 2번째<->마지막-1번째..)
    * ex) wonder -> rednow
    * */

    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            int a = 0, b = x.length()-1;
            char[] c  = x.toCharArray();

                while(a<b){
                    char tmp = c[a];
                    c[a]=c[b];
                    c[b]=tmp;
                    a++;
                    b--;
                }

                String tmp = String.valueOf(c); /*!!!*/
                answer.add(tmp);

        }

        return answer;
    }

    public static void main(String[] args) {
        Problem01_04_answer2 p = new Problem01_04_answer2();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        String[] arr = new String[cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = in.next();
        }

        for(String x : p.solution(arr)){
            System.out.println(x);
        }
    }
}
