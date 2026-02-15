import java.io.*;
import java.util.*;

public class Main {
    static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n == k) {
            bw.write("0");
        } else {
            bfs(n, k);
            bw.write(String.valueOf(time[k] - 1));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int start, int target) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        time[start] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == target)
                return;

            int[] nextMoves = {now - 1, now + 1, now * 2};

            for (int next : nextMoves) {
                if (next >= 0 && next <= 100000 && time[next] == 0) {
                    q.add(next);
                    time[next] = time[now] + 1;
                }
            }
        }
    }
}