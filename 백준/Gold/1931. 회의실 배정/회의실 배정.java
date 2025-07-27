import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] meetings = new int[N][2];

        // 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        // 끝시간 기준으로 정렬
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[0] - b[0]; // 끝시간이 같으면 시작시간 순
                }
                return a[1] - b[1];     // 끝시간 순
            }
        });

        int count = 0;
        int lastEndTime = 0;

        for (int i = 0; i < N; i++) {
            if (meetings[i][0] >= lastEndTime) {
                count++;
                lastEndTime = meetings[i][1];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}

/*
=== 핵심 포인트 ===

1. 데이터 저장: int[][] 2차원 배열 사용
   - meetings[i][0]: i번째 회의의 시작시간
   - meetings[i][1]: i번째 회의의 끝시간

2. 정렬 기준:
   - 1순위: 끝시간 오름차순 (a[1] - b[1])
   - 2순위: 시작시간 오름차순 (a[0] - b[0])

3. 그리디 선택:
   - 현재 회의 시작시간 >= 이전 회의 끝시간이면 선택
   - 선택하면 count 증가, lastEndTime 업데이트

4. 왜 끝시간 순으로 정렬?
   - 끝시간이 빠른 회의를 선택해야 뒤에 더 많은 회의를 배치 가능
   - 그리디 알고리즘의 핵심: 지역 최적해가 전역 최적해
*/