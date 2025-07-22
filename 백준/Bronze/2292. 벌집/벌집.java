import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int layer = 1; // 현재 층수

        // N이 1인 경우 (중앙)
        if (N == 1) {
            bw.write("1");
        } else {
            // N이 속한 층을 찾기
            // n층까지의 총 방 개수: 3n² - 3n + 1
            while (3 * layer * layer - 3 * layer + 1 < N) {
                layer++;
            }

            // layer층에 N이 있으므로, 거리는 layer
            bw.write(String.valueOf(layer));
        }

        bw.flush();
        bw.close();
    }
}