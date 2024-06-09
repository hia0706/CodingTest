import java.io.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            String str = br.readLine();
            String[] numbers = str.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            
            if (a == 0 && b == 0) {
                break;
            }
            bw.write((a+b) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}