package Problem05;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_03 {

    public int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        int i =0;
        for(int x : moves){
            while(i<n){
                if(board[i][x-1] != 0){

                    if(!stack.isEmpty() && stack.lastElement() == board[i][x-1]){ // lastElement() or peek() -- pop하지 않고 stack의 마지막을 확인
                        stack.pop();
                        answer+=2;
                    }else {
                        stack.push(board[i][x - 1]);
                    }
                    board[i][x - 1] = 0;
                    i=0;
                    break;
                }else{
                    i++;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int board[][] = new int[n][n];

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];

        for(int i=0;i<m;i++) {
            moves[i] = in.nextInt();
        }

        Problem05_03 p = new Problem05_03();
        System.out.print(p.solution(n, board, m, moves));
    }
}
