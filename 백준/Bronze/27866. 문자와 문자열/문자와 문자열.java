import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine()) - 1;
        
        br.close();
        System.out.print(s.charAt(n));
    }
}