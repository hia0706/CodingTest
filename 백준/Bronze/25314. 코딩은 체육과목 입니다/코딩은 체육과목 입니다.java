import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        
        for (int i = 1; i <= n/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }
}