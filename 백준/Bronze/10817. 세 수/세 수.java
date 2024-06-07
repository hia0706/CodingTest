import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = in.nextInt();
        }
        in.close();
        
        Arrays.sort(numbers);
        int mid = numbers[1];
        System.out.println(mid);
    }
}