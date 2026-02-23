import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();

        StringBuilder sb = new StringBuilder();

        int starIndex = 0;

        // * 위치 찾기
        for (int i = 0; i < 13; i++) {
            if (isbn.charAt(i) == '*') {
                starIndex = i;
                break;
            }
        }

        // 0~9 하나씩 넣어보기
        for (int x = 0; x <= 9; x++) {

            int sum = 0;

            for (int i = 0; i < 13; i++) {

                int number;

                if (i == starIndex) {
                    number = x;   // * 자리에 x 넣기
                } else {
                    number = isbn.charAt(i) - '0';
                }

                // 가중치 적용 (짝수 인덱스 1, 홀수 인덱스 3)
                if (i % 2 == 0) {
                    sum += number;
                } else {
                    sum += number * 3;
                }
            }

            // 10의 배수이면 정답
            if (sum % 10 == 0) {
                sb.append(x);
                break;
            }
        }

        System.out.println(sb);
    }
}