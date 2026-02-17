import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[1001];
        int count = 1;
        int total = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count > 1000)
                    break;
                arr[count] = i;
                count++;
            }
        }

        for (int i = a; i <= b; i++) {
            total += arr[i];
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}