package Problem02;

import java.util.Scanner;

public class Problem02_11_answer {

    public int solution(int cnt, int[][] arr) {
        int answer = 0;
        int max = 0;

        for(int i=0; i<cnt; i++){
            int y = 0;
            for(int j=0; j<cnt; j++){
                for(int k=0; k<5; k++){
                    if(arr[i][k] == arr[j][k]){
                        y++;
                        // break; // 한번이라도 같은 반이였던 사람을 구하기 때문에 break;
                    }
                }
            }
            if(max < y) {
                max = y;
                answer = i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem02_11_answer p = new Problem02_11_answer();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] arr = new int[cnt][5]; // 5학년 고정
        for(int i=0; i<cnt; i++){
            for(int j=0;j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(p.solution(cnt, arr));
    }
}
