import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = Integer.MIN_VALUE; // 최솟값으로 초기화
        int min = Integer.MAX_VALUE; // 최댓값으로 초기화

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(min + " " + max);

        br.close();
    }
}