import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        if (t % 10 != 0) {
            bw.write("-1");
        } else {
            int a = t / 300;
            t %= 300;

            int b = t / 60;
            t %= 60;

            int c = t / 10;
            bw.write(a + " " + b + " " + c);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}