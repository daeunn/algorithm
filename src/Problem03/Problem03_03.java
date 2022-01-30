package Problem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem03_03 {
    public int solution(int a, int b, int[] arr){
        int sum = 0, result = 0;

        int j=0;
        while(j<a-b){
            for(int i=j; i<j+b; i++){
                sum += arr[i];
            }

            if(sum > result){
                result = sum;
            }

            j++;
            sum = 0;

        }


        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int arr[] = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        Problem03_03 p = new Problem03_03();
        System.out.print(p.solution(a, b, arr));

    }
}
