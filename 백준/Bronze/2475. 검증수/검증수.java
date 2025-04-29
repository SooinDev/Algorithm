import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        // 5개의 숫자를 입력받아 각각 제곱한 후 합산
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }

        // 합계를 10으로 나눈 나머지를 출력
        int verificationNumber = sum % 10;
        System.out.println(verificationNumber);

        br.close();
    }
}