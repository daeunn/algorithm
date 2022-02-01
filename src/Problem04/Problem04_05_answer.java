package Problem04;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem04_05_answer {

    public  int solution(int a, int b, int[] arr){
        int answer = -1;
        // Treeset은 중복제거O, 정렬O
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // 내림차순

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                for(int k=0; k<a; k++){
                    if(i!=j && j!=k && i!=k){
                        set.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }
        int cnt = 0;
        // set.remove(143); // 143 삭제
        System.out.println(set.first()); // 제일처음 - 152
        System.out.println(set.last()); // 제일마지막 - 39

        for(int x : set){
           cnt ++;
           if(cnt == b) return x;
        }

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

        Problem04_05_answer p = new Problem04_05_answer();
        System.out.println(p.solution(a, b, arr));
    }
}
