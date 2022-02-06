package Problem05;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_02 {

    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else if(!stack.isEmpty() && Character.isAlphabetic(x)) stack.push(x);
            else if(stack.isEmpty() && Character.isAlphabetic(x)) answer+=x;
            else{
                while(stack.pop()!='('); // '('아닌동안 stack의 최상단에 있는거 꺼내기!!
                //System.out.println(stack.pop());
            }
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Problem05_02 p = new Problem05_02();
        System.out.print(p.solution(str));
    }
}
