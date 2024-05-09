import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String won = br.readLine();

            if (won.equals(".")) {
                break;
            }

            Stack<String> hyewon = new Stack<>();
            String[] hye = won.split("");

            for (String h : hye) {
                switch (h) {
                    case "(" :
                        hyewon.push(h);
                        break;    
                    case "[" :
                        hyewon.push(h);
                        break;
                    case ")" :
                        if (!hyewon.isEmpty() && hyewon.peek().equals("(")) {
                            hyewon.pop();
                        } else hyewon.push(h);
                        break;
                    case "]" :
                        if (!hyewon.isEmpty() && hyewon.peek().equals("[")) {
                            hyewon.pop();
                        } else hyewon.push(h);
                        break;
                }
            }

            if (hyewon.isEmpty()) {
                bw.write("yes\n");
            } else bw.write("no\n");
            
            bw.flush();
        }
    }
}
