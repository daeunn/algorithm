package Problem05;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_01 {

    public String solution(String str){
        String answer  = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Problem05_01 p = new Problem05_01();
        System.out.print(p.solution(str));
    }
}
