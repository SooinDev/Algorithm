import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        int x = 1;
        while (true) {
            int ceil = (x + A - 1) / A;
            if (ceil == I) {
                sb.append(x);
                break;
            }
            x++;
        }
        System.out.print(sb);
    }
}