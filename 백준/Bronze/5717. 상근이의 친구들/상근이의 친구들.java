import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 실제 입력 읽기
            int M = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());

            if (M == 0 && F == 0) {  // 종료 조건을 먼저 체크
                break;
            }

            int result = M + F;
            bw.write(result + "\n");  // 줄바꿈 추가
        }

        bw.flush();
        bw.close();
        br.close();
    }
}