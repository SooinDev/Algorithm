import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;

        if (arr[0] + arr[1] > arr[2]) {
            result = arr[0] + arr[1] + arr[2];
        } else {
            result = arr[0] + arr[1] + (arr[0] + arr[1] - 1);
        }

        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}