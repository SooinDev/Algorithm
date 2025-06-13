import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int total = R + B;  // L × W

        // L × W = total이고, (L-2) × (W-2) = B를 만족하는 L, W 찾기
        for (int L = 1; L <= total; L++) {
            if (total % L == 0) {  // L이 total의 약수인 경우
                int W = total / L;

                // 내부 타일 개수가 B와 같은지 확인
                if (L >= 3 && W >= 3 && (L-2) * (W-2) == B) {
                    // L >= W가 되도록 정렬
                    if (L >= W) {
                        bw.write(L + " " + W);
                    } else {
                        bw.write(W + " " + L);
                    }
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}