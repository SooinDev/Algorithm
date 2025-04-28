import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에서 숫자의 개수 N을 읽어옴
        int N = Integer.parseInt(br.readLine());

        // 둘째 줄에서 공백 없이 주어진 숫자들을 읽어옴
        String numbers = br.readLine();

        int sum = 0;

        // 각 자리의 숫자를 하나씩 읽어서 합을 계산
        for (int i = 0; i < N; i++) {
            // 문자를 숫자로 변환하여 더함
            sum += numbers.charAt(i) - '0';
        }

        // 합을 출력
        System.out.println(sum);

        br.close();
    }
}