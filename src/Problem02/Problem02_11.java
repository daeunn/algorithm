package Problem02;

import java.util.Scanner;

public class Problem02_11 {

    public int solution(int cnt, int[][] arr){
        int answer = 0;
        int[] x = new int[cnt];
        int max = 0;

        for(int i=1; i<cnt; i++){
            int y = 0;
            for(int j=1; j<cnt; j++) {
                for(int k=1; k<cnt; k++){
                    if (arr[i][k] == arr[j][k]) {
                        System.out.println(k+","+i+","+j+","+arr[i][k]);
                        x[k] = y++;
                        break;
                    }
                }
            }
            if(y>max) {
                max = y;
                answer = i;
            }
        }


        int xx = 0;

        for(int i=0;i<cnt;i++){
            System.out.println(x[i]);
//            if(x[i] > xx) {
//                xx = x[i];
//                answer = i+1;
//            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Problem02_11 p = new Problem02_11();
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
