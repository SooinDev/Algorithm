import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = -1;

        for (int i = m; i <= n; i++) {
            if (i == 1) 
                continue;

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;

                if (min == -1) {
                    min = i;
                }
            }
        }

        if (min == -1) {
            bw.write("-1");
        } else {
            bw.write(sum + "\n" + min);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}