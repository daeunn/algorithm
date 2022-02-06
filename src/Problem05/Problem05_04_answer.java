package Problem05;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_04_answer {

    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){ // x가 숫자인지
                stack.push(x-48); // 아스키코드 0 : 48
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='-') stack.push( lt-rt);
                else if(x=='+') stack.push(lt+rt);
                else if(x=='*') stack.push(lt * rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }

        answer = stack.pop();

        return answer;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Problem05_04_answer p = new Problem05_04_answer();
        System.out.print(p.solution(str));
    }
}
