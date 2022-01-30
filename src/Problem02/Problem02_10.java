package Problem02;

import java.util.ArrayList;
import java.util.Scanner;

/*N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다..*/
public class Problem02_10 {

    public int solution(int cnt, int[][] arr){
        int answer = 0;
        int x = 0;

        for(int i=0; i<cnt; i++){
          for(int j=0; j<cnt; j++){
          //    System.out.println(i+","+j+","+cnt);

              if((i-1<0 && j-1<0) || (i-1>cnt && j-1>cnt) || (i-1<0 && j-1>cnt) || (i-1>cnt && j-1<0) ){
                  x++;
                  System.out.println("xx");
              }else if ((arr[i][j] > arr[i-1][j-1]) && (arr[i][j] > arr[i][j-1]) && (arr[i][j] > arr[i+1][j]) && (arr[i][j] > arr[i][j+1])) {
                      x++;
                  }
              }

              if(x==4) {
                  answer ++;
              }
              x=0;
          }


        return answer;
    }

    public static void main(String[] args) {
        Problem02_10 p = new Problem02_10();
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
