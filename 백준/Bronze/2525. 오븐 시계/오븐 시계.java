import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt(); // 시
        int b = in.nextInt(); // 분
        int m = in.nextInt(); // 필요 시간
        
        b = a * 60 + b;
        b = b + m;
        
        a = (b / 60) %24; // 시
        int result = b % 60; // 분
        
        System.out.println(a + " " + result);
    }
}