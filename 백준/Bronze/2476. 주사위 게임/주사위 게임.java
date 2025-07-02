import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            int[] arr = new int[3];
            int value = 0;
            int max = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] > arr[1] && arr[0] > arr[2])
                max = arr[0];
            else if (arr[1] > arr[0] && arr[1] > arr[2])
                max = arr[1];
            else if (arr[2] > arr[0] && arr[2] > arr[1])
                max = arr[2];

            if (arr[0] == arr[1] && arr[1] == arr[2])
                value = 10000 + arr[0] * 1000;
            else if (arr[0] == arr[1] || arr[1] == arr[2])
                value = 1000 + arr[1] * 100;
            else if (arr[0] == arr[2] || arr[2] == arr[1])
                value = 1000 + arr[2] * 100;
            else
                value = max * 100;

            values[i] = value;
        }

        result = Arrays.stream(values).max().getAsInt();

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}