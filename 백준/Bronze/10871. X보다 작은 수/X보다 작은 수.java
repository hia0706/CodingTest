import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int x = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
        in.close();
    }
}