import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Y = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int O = M - Y + M;

        bw.write(O + "");

        bw.flush();
        bw.close();
        br.close();
    }
}