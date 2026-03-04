import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 101;
            int max = 0;
            int gap = 0;

            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                int score = Integer.parseInt(st.nextToken());

                if (score < min)
                    min = score;

                if (score > max)
                    max = score;

                arr[j] = score;
            }

            Arrays.sort(arr);

            for (int l = 0; l < arr.length - 1; l++) {
                if (arr[l + 1] - arr[l] > gap)
                    gap = arr[l + 1] - arr[l];
            }

            sb.append("Class ").append(i + 1).append("\n")
                    .append("Max ").append(max).append(", ")
                    .append("Min ").append(min).append(", ")
                    .append("Largest gap ").append(gap)
                    .append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}