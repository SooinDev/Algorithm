import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int V = Integer.parseInt(br.readLine());
        int m = T * V;
        bw.write(m + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}