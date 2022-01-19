package Problem01;

import java.util.Scanner;

public class Problem01_05 {

    public String solution(String str){
        String answer = "";

        char[] a = str.toCharArray();
        int len = (str.length()-1);
        for(int i=0;i<=len/2;i++){
            if(a[i] >= 65 && a[i] <= 122){
                char tmp = a[i];
                a[i] = a[len-i];
                a[len-i] = tmp;
            }
        }

        answer = String.valueOf(a);

        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Problem01_05 p = new Problem01_05();
        System.out.println(p.solution(input));
    }
}
