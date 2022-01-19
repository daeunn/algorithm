package Problem01;

import java.util.Scanner;

public class Problem01_05_answer {

    public String solution(String str){
        String answer = "";

        char[] a = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(a[lt])) lt++;
            else if(!Character.isAlphabetic(a[rt])) rt--;
            else{
                char tmp = a[lt];
                a[lt] = a[rt];
                a[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(a);

        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Problem01_05_answer p = new Problem01_05_answer();
        System.out.println(p.solution(input));
    }
}
