import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        // EOF까지 입력 받기
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            int N = Integer.parseInt(st.nextToken());  // 사람 수
            int S = Integer.parseInt(st.nextToken());  // 주식 수

            // 총 인원 = N명 + 심사위원장 1명
            int totalPeople = N + 1;

            // 각자 받을 수 있는 최대 주식 수 = S를 총 인원으로 나눈 몫
            int x = S / totalPeople;

            bw.write(x + "\n");
        }

        br.close();
        bw.close();
    }
}