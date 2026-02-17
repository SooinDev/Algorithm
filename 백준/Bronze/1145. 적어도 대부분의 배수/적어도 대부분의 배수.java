import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int val = 1;

        while (true) {
            int count = 0;

            for (int i = 0; i < 5; i++) {
                if (val % arr[i] == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                bw.write(String.valueOf(val));
                break;
            }

            val++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}