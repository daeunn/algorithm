package Problem01;

import java.util.*;

public class Problem01_04_answer {

    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString(); /*StringBuilder*/
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem01_04_answer p = new Problem01_04_answer();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        String[] arr = new String[cnt];

        for(int i=0; i<cnt; i++) {
            arr[i] = in.next();
        }

        for(String x : p.solution(arr)){
            System.out.println(x);
        }
    }
}
