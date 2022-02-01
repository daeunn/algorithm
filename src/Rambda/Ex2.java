package Rambda;

public class Ex2 {

    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0; i<10; i++){
                System.out.println("hello");
            }
        }).start();
    }
}
