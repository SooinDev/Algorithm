import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 각 테스트 케이스마다 새로운 줄 읽기
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write((x + y) + "\n"); // 줄바꿈 추가
        }

        bw.flush();
        bw.close();
        br.close();
    }
}