import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        int a = 1;
        int b = 0;

        for (int i = 0; i < k; i++) {
            int newA = b;
            int newB = a + b;
            a = newA;
            b = newB;
        }

        sb.append(a).append(" ").append(b);

        System.out.print(sb);
        br.close();
    }
}