import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double temp = n * 0.15;
        int percent = Math.toIntExact(Math.round(temp));
        int[] arr = new int[n];
        int average = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = percent; i < n - percent; i++) {
            total += arr[i];
        }

        average = (int) Math.round((float) total / (n - 2 * percent));

        bw.write(String.valueOf(average));

        bw.flush();
        bw.close();
        br.close();
    }
}