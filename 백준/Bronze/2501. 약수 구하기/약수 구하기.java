import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0)
                list.add(i);
        }

        try {
            answer = list.get(K - 1);
        }
        catch (Exception e) {
            answer = 0;
        }
        bw.write(answer + "");

        br.close();
        bw.close();
    }
}