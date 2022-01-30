package Problem02;

import java.util.Scanner;

public class Problem02_12_answer {

    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int count = 0;
               for(int k=0; k<m; k++) { // 문제수
                   int pi = 0;
                   int pj = 0;
                   for (int y=0; y<n; y++) { // 등수
                       if (arr[k][y] == i) pi = y;
                       if (arr[k][y] == j) pj = y;
                   }
                   if (pi < pj) count++; // i의 등수가 j의 등수보다 커야함
                   }
                   if(count == m){ // 문제수 만큼 증가했으면
                       answer++;
                      // System.out.println(i + "," + j);
               }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem02_12_answer p = new Problem02_12_answer();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 학생
        int m = in.nextInt(); // 문제
        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(p.solution(n, m, arr));

    }
}
