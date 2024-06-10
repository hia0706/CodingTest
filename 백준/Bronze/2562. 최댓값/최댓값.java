import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int max = 0;
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                idx = i + 1;
            }
        }
        sb.append(max).append("\n").append(idx);
        System.out.println(sb);
    }
}