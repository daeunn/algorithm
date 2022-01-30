package Problem03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem03_02 {
    public ArrayList<Integer> solution(int a, int[] arr1, int b, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int x : arr1) {
            list.add(x);
        }

        for(int y : arr2){
            if(list.contains(y)) {
                list2.add(y);
            }
        }

        Collections.sort(list2);

        return list2;
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

        Problem03_02 p = new Problem03_02();
        for(int x : p.solution(a, arr1, b, arr2)){
            System.out.print(x + " ");
        }
    }
}
