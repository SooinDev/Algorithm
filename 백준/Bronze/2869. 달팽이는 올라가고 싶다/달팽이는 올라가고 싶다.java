import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 거리
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 거리
        int V = Integer.parseInt(st.nextToken()); // 나무 막대의 높이

        int result;

        if (V <= A) {
            // 첫날에 바로 도달
            result = 1;
        } else {
            // (V - A)미터까지는 하루에 (A-B)씩 올라가고,
            // 마지막 날 A미터 올라가서 V에 도달
            result = (V - A - 1) / (A - B) + 2;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}