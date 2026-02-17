import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int maxFactor = 0;

            for (int j = 2; j * j <= temp; j++) {
                while (temp % j == 0) {
                    maxFactor = j;
                    temp /= j;
                }
            }

            if (temp > 1)
                maxFactor = temp;

            if (maxFactor <= k)
                count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}