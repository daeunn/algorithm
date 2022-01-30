package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

/*N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다..*/
public class Problem02_09_answer {

    public int solution(int cnt, int[][] arr){
        int answer = 0;
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for(int i=0; i<cnt; i++){
            sum1 = 0; sum2 = 0;
          for(int j=0; j<cnt; j++){
               sum1 += arr[i][j];
               sum2 += arr[j][i];
          }
          answer = Math.max(answer, sum1);
          answer = Math.max(answer, sum2);
        }

        sum1 = 0; sum2 = 0;
        for(int x=0;x<cnt;x++){
            sum1 += arr[x][x];
            sum2 += arr[x][cnt-x-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Problem02_09_answer p = new Problem02_09_answer();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[][] arr = new int[cnt][cnt];

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(p.solution(cnt, arr));
    }
}
