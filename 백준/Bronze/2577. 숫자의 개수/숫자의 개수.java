import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String resultToString = Integer.toString(result);

        // 0부터 9까지의 숫자 출현 횟수를 저장할 배열
        int[] counts = new int[10];

        // 결과 문자열을 순회하며 각 숫자의 출현 횟수를 세기
        for (int i = 0; i < resultToString.length(); i++) {
            // 문자를 정수로 변환 ('0'은 아스키 코드 48)
            int digit = resultToString.charAt(i) - '0';
            // 해당 숫자의 카운트 증가
            counts[digit]++;
        }

        // 0부터 9까지 각 숫자의 출현 횟수 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }

        // BufferedReader 닫기
        br.close();
    }
}