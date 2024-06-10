import java.io.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int a,b;

    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        sb.append(a + b);
        System.out.println(sb);
    }
}