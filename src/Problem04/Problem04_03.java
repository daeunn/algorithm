package Problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem04_03 {

    public ArrayList<Integer> solution(int n, int k, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> answer = new ArrayList<>();

        int lt=0, rt=k;
        while(rt<=n) {
            for (int i = lt; i < rt; i++) {
                map.put(arr[i], map.getOrDefault(i, 0) + 1);
            }
            //map.keySet().stream().forEach(System.out::println);
            //System.out.println("--------------");
            answer.add(map.size());
            lt++;
            rt++;
            map.clear();
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

        Problem04_03 p = new Problem04_03();
        for(int x : p.solution(n, k, arr)){
            System.out.print(x + " ");
        }
    }
}
