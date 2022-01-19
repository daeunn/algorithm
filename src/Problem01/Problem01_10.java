package Problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01_10 {
    /*
    * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
    * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
    * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
    * */

    public int[] solution(String str, char a){

        int[] answer = new int[str.length()];
        ArrayList<Integer> index = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            if(a==str.charAt(i)){
                index.add(i);
            }
        }

        for(int i=0; i<str.length(); i++){
            answer[i] = str.length();
           for(int x : index) {
               if (answer[i] > Math.abs(i - x)) answer[i] = Math.abs(i - x);
           }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char input2 = in.next().charAt(0);

        Problem01_10 p = new Problem01_10();
        for(int x : p.solution(input, input2)){
            System.out.print(x+" ");
        }

    }
}
