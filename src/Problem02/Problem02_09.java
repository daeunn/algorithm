package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

/*N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다..*/
public class Problem02_09 {

    public ArrayList<Integer> solution(int cnt, int[][] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int x = 0;
        int a = 0;

        for(int i=1; i<cnt; i++){
          for(int j=1; j<cnt; j++){
               if(i == j) a += arr[i][j];
          }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem02_09 p = new Problem02_09();
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
