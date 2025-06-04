import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 그리디 알고리즘 적용
        int n = Integer.parseInt(br.readLine());
        int answer = -1;

        // 5킬로그램 봉지를 최대한 많이 사용하는 경우부터 시도
        for (int five = n / 5; five >= 0; five--) {
            int remaining = n - (five * 5);  // 5킬로그램 봉지 사용 후 남은 무게

            // 남은 무게가 3의 배수인지 확인
            if (remaining % 3 == 0) {
                int three = remaining / 3;  // 필요한 3킬로그램 봉지 개수
                answer = five + three;
                break;  // 최소 개수를 찾았으므로 종료
            }
        }

        System.out.println(answer);
        br.close();
    }
}