import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // 입력이 더 이상 없을 때까지 반복
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");

            if (st.countTokens() < 2) {
                break; // 입력 형식이 맞지 않으면 종료
            }

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }

        br.close();
    }
}