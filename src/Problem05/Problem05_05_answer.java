package Problem05;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_05_answer {

    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '('){
                    answer += stack.size();
                }else{
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Problem05_05_answer p = new Problem05_05_answer();
        System.out.print(p.solution(str));
    }
}
