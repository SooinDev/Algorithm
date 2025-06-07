import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());  // int → long
        long B = Long.parseLong(st.nextToken());  // int → long
        long result = (A + B) * (A - B);          // int → long

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}