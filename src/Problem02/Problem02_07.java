package Problem02;


import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_07 {


    public int solution(int cnt, int[] arr){
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int t = 1;

        for(int i=0; i<cnt; i++){
            if(arr[i] == 0) {
                list.add(0);
                t = 1;
            }
            else if(arr[i] == 1) {
                list.add(t);
                t++;
            }
        }

        for(int x : list){
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem02_07 p = new Problem02_07();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr = new int[cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p.solution(cnt, arr));
    }
}
