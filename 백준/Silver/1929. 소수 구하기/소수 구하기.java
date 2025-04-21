import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = m; i <= n; i++) {
            if (i == 1) continue;

            boolean isPrime = true;

            // 2부터 a의 제곱근까지 나누어 떨어지는지 확인
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        br.close();
    }
}