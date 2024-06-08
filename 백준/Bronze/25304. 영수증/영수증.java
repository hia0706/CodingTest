import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            total += a * b;
        }
        if (total == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
 }