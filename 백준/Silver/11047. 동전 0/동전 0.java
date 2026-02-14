import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long temp = 0;
        int count = 0;
        long[] arr = new long[n];

        for (int i = n - 1; i >= 0; i--) {
            long coin = Long.parseLong(br.readLine());
            arr[i] = coin;
        }

        for (int i = 0; i < n; i++) {
            temp += (k / arr[i]);
            k = k % arr[i];
        }
        bw.write(temp + "");

        bw.flush();
        bw.close();
        br.close();
    }
}