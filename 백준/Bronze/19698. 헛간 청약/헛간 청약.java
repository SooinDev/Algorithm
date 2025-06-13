import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        // 가로 방향에 들어갈 수 있는 소의 개수
        int cowsInWidth = W / L;
        // 세로 방향에 들어갈 수 있는 소의 개수  
        int cowsInHeight = H / L;
        
        // 전체 들어갈 수 있는 소의 개수
        int maxCows = cowsInWidth * cowsInHeight;
        
        // 실제 입주할 수 있는 소의 개수 (N마리보다 많을 수는 없음)
        int answer = Math.min(N, maxCows);

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}