package Problem02;

import java.util.Scanner;

/*N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다..*/
public class Problem02_10_answer {

    public int solution(int cnt, int[][] arr){
        int answer = 0;
        int[] x = {0, -1, 0, 1};
        int[] y = {-1, 0, 1, 0};

        for(int i=0; i<cnt; i++) {
            for (int j = 0; j < cnt; j++) {

                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + x[k];
                    int ny = j + y[k];


                    if (nx >= 0 && ny>= 0  && nx <cnt && ny < cnt && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Problem02_10_answer p = new Problem02_10_answer();
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
