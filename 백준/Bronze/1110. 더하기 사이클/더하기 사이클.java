import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int copy = n;
        int count = 0;

        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;

            if (n == copy)
                break;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}