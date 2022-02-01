package Problem04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem04_05 {

    public  int solution(int a, int b, int[] arr){
        int answer = 0;
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                for(int k=0; k<a; k++){
                    if(i!=j && j!=k && i!=k){
                        set.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }
        int num = 0;
        for(int x : set){
            map.put(num++, x);
        }
        answer = map.get(set.size()-b);

        return answer;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int arr[] = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }

        Problem04_05 p = new Problem04_05();
        System.out.println(p.solution(a, b, arr));
    }
}
