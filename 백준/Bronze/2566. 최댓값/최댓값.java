import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[9][9];
        int max = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    a = i + 1;
                    b = j + 1;
                }
            }
        }
        sb.append(max).append("\n");
        sb.append(a).append(" ").append(b);
        System.out.println(sb);
    }
}