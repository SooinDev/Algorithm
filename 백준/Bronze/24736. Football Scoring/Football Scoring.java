import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 원정팀 점수 계산
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int T1 = Integer.parseInt(st1.nextToken()); // 터치다운
        int F1 = Integer.parseInt(st1.nextToken()); // 필드골
        int S1 = Integer.parseInt(st1.nextToken()); // 세이프티
        int P1 = Integer.parseInt(st1.nextToken()); // 1점 추가득점
        int C1 = Integer.parseInt(st1.nextToken()); // 2점 추가득점
        
        int visitingScore = T1 * 6 + F1 * 3 + S1 * 2 + P1 * 1 + C1 * 2;
        
        // 홈팀 점수 계산
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T2 = Integer.parseInt(st2.nextToken());
        int F2 = Integer.parseInt(st2.nextToken());
        int S2 = Integer.parseInt(st2.nextToken());
        int P2 = Integer.parseInt(st2.nextToken());
        int C2 = Integer.parseInt(st2.nextToken());
        
        int homeScore = T2 * 6 + F2 * 3 + S2 * 2 + P2 * 1 + C2 * 2;
        
        bw.write(visitingScore + " " + homeScore + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}