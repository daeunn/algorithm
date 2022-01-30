package Problem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem03_01 {
    public ArrayList<Integer> solution(int a, int[] arr1, int b, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();

        for(int x : arr1) {
            list.add(x);
        }

        for(int y : arr2){
            list.add(y);
        }

        Collections.sort(list);

        return list;
    }

    public int[] solution2(int a, int[] arr1, int b, int[] arr2){
        int answer[] = new int[a+b];

        /*
        for(int i=0; i<a; i++){
            answer[i] = arr1[i];
        }
        for(int i=0; i<b; i++){
            answer[i+a] = arr2[i];
        }
        */

        /*배열복사*/
        //System.arraycopy(복사할 배열, 복사할 배열 시작 위치, 복사될 배열, 복사될 배열 시작 위치, 복사할 원소 수)
        System.arraycopy(arr1, 0, answer, 0, a);
        System.arraycopy(arr2, 0, answer, a, b);

        // 오름차순으로 정렬
        Arrays.sort(answer);


        Integer answer2[] = {1,3,6,10}; //int는 불가능 ㅜㅜ

        // 1) 내림차순으로 정렬
        Arrays.sort(answer2, Collections.reverseOrder()); // Comparator 객체

        // 2) 내림차순으로 정렬(2)
        Arrays.sort(answer2, (i1, i2) -> i2 - i1); //lamda


        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int arr1[] = new int[a];

        for(int i=0; i<a; i++){
            arr1[i] = in.nextInt();
        }
        int b = in.nextInt();
        int arr2[] = new int[b];
        for(int i=0; i<b; i++){
            arr2[i] = in.nextInt();
        }

        Problem03_01 p = new Problem03_01();
        for(int x : p.solution2(a, arr1, b, arr2)){
            System.out.print(x + " ");
        }
    }
}
