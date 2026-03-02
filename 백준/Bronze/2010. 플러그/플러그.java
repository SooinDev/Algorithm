import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            result += num - 1;
        }
        result = result + 1;

        sb.append(result);

        System.out.print(sb);
        br.close();
    }
}