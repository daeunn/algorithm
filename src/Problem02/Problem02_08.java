package Problem02;

import java.util.*;

/*입력된 순서대로 등수를 출력한다.*/
public class Problem02_08 {

    public ArrayList<Integer> solution(int cnt, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int x = 1;

        for(int i=0; i<cnt; i++){
          for(int j=0; j<cnt; j++){
              if(arr[i] < arr[j]) x++;
          }
          answer.add(x);
          x = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem02_08 p = new Problem02_08();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr = new int[cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : p.solution(cnt, arr)){
            System.out.print(x+" ");
        }
    }
}
