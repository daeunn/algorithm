package Problem03;

import java.util.Scanner;

public class Problem03_06 {
    public int solution(int a, int b, int[] arr){
        int answer = 0, sum = 0, cnt = 0;

        int j=0;
        for(int i=0; i<a; i++){
            if(arr[i]==0){
                if(cnt<=b) {
                    cnt++;
                    sum++;
                }else{
                    if(arr[j] == 0) {
                        cnt--;
                    }
                    j++;
                    sum--;
                    System.out.println("j:"+j);
                }
            }else{
                sum ++;
                System.out.println("i:"+i);
            }

            if (answer < sum) {
                answer = sum;
            }


        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int arr[] = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        Problem03_06 p = new Problem03_06();
        System.out.print(p.solution(a, b, arr));

    }
}
