import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 민국이의 점수 입력
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int minguk1 = Integer.parseInt(st1.nextToken()); // 정보
        int minguk2 = Integer.parseInt(st1.nextToken()); // 수학
        int minguk3 = Integer.parseInt(st1.nextToken()); // 과학
        int minguk4 = Integer.parseInt(st1.nextToken()); // 영어
        int S = minguk1 + minguk2 + minguk3 + minguk4; // 민국이 총점

        // 만세의 점수 입력
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int manse1 = Integer.parseInt(st2.nextToken()); // 정보
        int manse2 = Integer.parseInt(st2.nextToken()); // 수학
        int manse3 = Integer.parseInt(st2.nextToken()); // 과학
        int manse4 = Integer.parseInt(st2.nextToken()); // 영어
        int T = manse1 + manse2 + manse3 + manse4; // 만세 총점

        // 비교 및 출력
        if (S >= T) {  // 동점일 때도 민국이 출력
            bw.write(S + "\n");
        } else {
            bw.write(T + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}