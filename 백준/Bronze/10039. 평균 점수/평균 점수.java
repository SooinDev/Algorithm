import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = 0;
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n < 40)
                n = 40;

            total += n;
        }

        avg = total / 5;

        bw.write(String.valueOf(avg));

        bw.flush();
        bw.close();
        br.close();
    }
}