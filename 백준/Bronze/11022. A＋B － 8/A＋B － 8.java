import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        int x = 0;
        
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            x++;
            bw.write("Case #" + x + ": " + a + " + " + b + " = " + (a+b) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}