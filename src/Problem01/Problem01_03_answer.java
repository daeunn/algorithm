package Problem01;

import java.util.Scanner;

public class Problem01_03_answer {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        //System.out.println(str.indexOf(' '));

        while((pos = str.indexOf(' '))!=-1){
           String tmp = str.substring(0, pos);
           int len = tmp.length();
           if(m < len){
               answer = tmp;
               m = len;
           }
           str = str.substring(pos+1);
        }
        if(str.length() > m)  answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Problem01_03_answer p = new Problem01_03_answer();
        System.out.println(p.solution(str));
    }
}
