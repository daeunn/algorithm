package Problem03;

import java.util.Scanner;

public class Problem03_04_answer {
    public int solution(int a, int b, int[] arr){
        int sum = 0, answer = 0, j=0;

        for(int i=0; i<a; i++){

            sum += arr[i];

            if(sum == b) {
                answer++;
            }

            while(sum>=b){
                sum -= arr[j++];
                if(sum == b) {
                    answer++;
                }
            }
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
        Problem03_04_answer p = new Problem03_04_answer();
        System.out.print(p.solution(a, b, arr));

    }
}
