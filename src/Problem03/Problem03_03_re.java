package Problem03;

import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class Problem03_03_re {
    public int solution(int a, int b, int[] arr){
        int sum = 0, answer = 0;

        for(int i=0; i<b; i++){
            sum += arr[i];
            answer = sum;
        }

        for(int j=b; j<a; j++){
            sum += (arr[j] - arr[j-b]);
            answer = Math.max(answer, sum);
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
        Problem03_03_re p = new Problem03_03_re();
        System.out.print(p.solution(a, b, arr));

    }
}
