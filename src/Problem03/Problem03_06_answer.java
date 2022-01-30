package Problem03;

import java.util.Scanner;

public class Problem03_06_answer {
    /*
    * 예시입력
    * 14 2
    * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
    *
    * 답 : 8
    * */
    public int solution(int a, int b, int[] arr){
        int answer = 0, cnt = 0;

        int lt=0;
        for(int rt=0; rt<a; rt++){
            if(arr[rt]==0) cnt++;

            while(cnt>b) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }


            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int arr[] = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        Problem03_06_answer p = new Problem03_06_answer();
        System.out.print(p.solution(a, b, arr));

    }
}
