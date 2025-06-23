import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int cookingTime = Integer.parseInt(br.readLine());

        // 현재 시간을 총 초로 변환
        int totalSeconds = second + minute * 60 + hour * 3600;
        
        // 요리 시간 추가
        totalSeconds += cookingTime;
        
        // 결과 시간 계산
        int resultHour = (totalSeconds / 3600) % 24;  // 24로 나머지 연산
        int resultMinute = (totalSeconds % 3600) / 60;
        int resultSecond = totalSeconds % 60;

        bw.write(resultHour + " " + resultMinute + " " + resultSecond + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}