import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int sum = 0;
        int consecutiveCount = 0;  // 연속으로 맞춘 개수를 추적

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (num == 1) {
                consecutiveCount++;  // 연속 카운트 증가
                sum += consecutiveCount;  // 현재 연속 카운트만큼 점수 추가
            } else {
                consecutiveCount = 0;  // 틀리면 연속 카운트 리셋
            }
        }

        bw.write(sum + "");
        br.close();
        bw.close();
    }
}