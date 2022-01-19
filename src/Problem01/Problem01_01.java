package Problem01;

import java.util.Locale;
import java.util.Scanner;

public class Problem01_01 {
    /*
    * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
    * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();

        int size = 0;

        if(input1.length() > 100) {
            input1 = input1.substring(0, 100);
        }

        for(int i=1; i<=input1.length(); i++){
            String a = input1.substring(i-1, i).toUpperCase();

            if(a.equals(input2.toUpperCase())){
                size ++;
            }
        }

        System.out.println(size);

        return ;
    }
}
