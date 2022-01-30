package Problem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem03_02_answer {
    public ArrayList<Integer> solution(int a, int[] arr1, int b, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while(i<a && j<b){
            if(arr1[i]==arr2[j]) answer.add(arr1[i++]);
            if(arr1[i]<arr2[j]) i++;
            else j++;
        }

        while(i<a) i++;
        while(j<b) j++;

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

        Problem03_02_answer p = new Problem03_02_answer();
        for(int x : p.solution(a, arr1, b, arr2)){
            System.out.print(x + " ");
        }
    }
}
