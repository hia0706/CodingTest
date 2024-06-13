import java.io.*;
import java.util.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static int a,b;
    public static String str;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        str = "Case #";

        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append(str + i + ": " + a + " + " + b + " = " + (a + b)).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}