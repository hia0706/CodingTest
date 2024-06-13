import java.io.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n/4; i++) {
            sb.append("long ");
        }
        br.close();
        System.out.println(sb + "int");
    }
}