import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] shirts = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int countT = 0;
        for (int i = 0; i < 6; i++) {
            countT += shirts[i] / t;

            if (shirts[i] % t != 0) {
                countT++;
            }
        }

        int countP = n / p;
        int singleP = n % p;

        bw.write(countT + "\n");
        bw.write(countP + " " + singleP + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}