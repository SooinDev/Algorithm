import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] xList = new int[n];
        int[] yList = new int[n];



        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xList[i] = Integer.parseInt(st.nextToken());
            yList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(xList);
        Arrays.sort(yList);

        int midX = xList[(n - 1) / 2];
        int midY = yList[(n - 1) / 2];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.abs(midX - xList[i]) + Math.abs(midY - yList[i]);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}