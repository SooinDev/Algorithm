import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double result = Math.sqrt(n);
        double answer = Math.floor(result);

        bw.write("The largest square has side length " + (int) answer + ".");

        bw.flush();
        bw.close();
        br.close();
    }
}