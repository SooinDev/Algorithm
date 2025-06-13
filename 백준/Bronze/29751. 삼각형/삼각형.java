import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double result = w * h / 2;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}