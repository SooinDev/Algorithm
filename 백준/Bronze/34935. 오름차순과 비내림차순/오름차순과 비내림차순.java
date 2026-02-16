import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        boolean isAscending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}