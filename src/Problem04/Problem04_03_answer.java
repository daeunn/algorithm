package Problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem04_03_answer {

    public ArrayList<Integer> solution(int n, int k, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0){
                map.remove(arr[rt]);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
           arr[i] = in.nextInt();
        }

        Problem04_03_answer p = new Problem04_03_answer();
        for(int x : p.solution(n, k, arr)){
            System.out.print(x + " ");
        }
    }
}
