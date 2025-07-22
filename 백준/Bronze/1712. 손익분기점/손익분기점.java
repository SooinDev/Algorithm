import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken()); // 고정비용
        long B = Long.parseLong(st.nextToken()); // 가변비용(대당)
        long C = Long.parseLong(st.nextToken()); // 판매가격(대당)

        long answer;

        // 손익분기점이 존재하지 않는 경우
        if (C <= B) {
            answer = -1;
        } else {
            // n > A / (C - B)를 만족하는 최소 정수
            // A / (C - B)의 소수점 이하를 올림한 값
            answer = A / (C - B) + 1;

            // 정확히 나누어떨어지는 경우 확인
            if (A % (C - B) == 0) {
                answer = A / (C - B) + 1;
            } else {
                answer = A / (C - B) + 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}