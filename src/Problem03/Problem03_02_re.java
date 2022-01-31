package Problem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem03_02_re {
    public ArrayList<Integer> solution(int a, int[] arr1, int b, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;

        while(p1<a && p2<b){
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }

        while(p2<b) answer.add(arr2[p2++]);
        while(p1<a) answer.add(arr1[p1++]);

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int arr1[] = new int[a];

        for(int i=0; i<a; i++){
            arr1[i] = in.nextInt();
        }
        int b = in.nextInt();
        int arr2[] = new int[b];
        for(int i=0; i<b; i++){
            arr2[i] = in.nextInt();
        }

        Problem03_02_re p = new Problem03_02_re();
        for(int x : p.solution(a, arr1, b, arr2)){
            System.out.print(x + " ");
        }
    }
}
