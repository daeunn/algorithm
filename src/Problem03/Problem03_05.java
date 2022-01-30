package Problem03;

import java.util.Scanner;

public class Problem03_05 {
    public int solution(int a){
        int answer = 0, sum = 0, j=1;

        for(int i=1; i<=a-1; i++){
            sum += i;

            if(sum == a) answer ++;

            while(sum >= a){
                sum -= j;
                j++;

                if(sum == a) answer ++;
            }

        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        Problem03_05 p = new Problem03_05();
        System.out.print(p.solution(a));

    }
}
