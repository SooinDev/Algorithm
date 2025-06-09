import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = R * 8 + C * 3 - 28;

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}