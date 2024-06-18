import java.io.*;
import java.util.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    
    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        
        int min = 1000000;
        int max = -1000000;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        br.close();
        System.out.println(min + " " + max);
    }
}