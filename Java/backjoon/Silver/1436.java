import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int cnt = 666;
        int count = 1;

        while(count != N) {
            cnt++;

            if (String.valueOf(N).contains("666")) {
                count++;
            }
        }

        System.err.println(cnt);
    }
}