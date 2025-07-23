import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        // 좌표를 저장할 배열
        int[][] points = new int[N][2];

        // 좌표 입력받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            points[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }
        
        // 정렬: x좌표 기준으로 오름차순, x가 같으면 y좌표 기준으로 오름차순
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                // x좌표 비교
                if (point1[0] != point2[0]) {
                    return point1[0] - point2[0]; // x좌표 오름차순
                }
                // x좌표가 같으면 y좌표 비교
                return point1[1] - point2[1]; // y좌표 오름차순
            }
        });
        
        // 결과 출력
        for (int i = 0; i < N; i++) {
            bw.write(points[i][0] + " " + points[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}