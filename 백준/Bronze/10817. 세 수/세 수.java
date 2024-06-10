import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[3];
        
        for (int i = 0; i < numbers.length; i++) {
            if (st.hasMoreTokens()) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(numbers);
        System.out.print(numbers[1]);
    }
}