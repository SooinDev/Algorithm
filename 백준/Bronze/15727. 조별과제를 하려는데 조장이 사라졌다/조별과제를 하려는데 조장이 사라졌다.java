import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());

        int t = (L + 4) / 5;

        bw.write(String.valueOf(t));
        bw.flush();

        bw.close();
        br.close();
    }
}