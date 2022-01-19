package Problem02;


import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_08_answer {


    public ArrayList<Integer> solution(int cnt, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int num[] = new int[cnt];

        for(int i=0; i<cnt; i++){

          for(int j=0; j<cnt; j++){
              if(arr[i] < arr[j]){
                  num[j] = cnt--;
              }
          }
        }

        for(int x : num){
            System.out.println(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem02_08_answer p = new Problem02_08_answer();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr = new int[cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p.solution(cnt, arr));
    }
}
