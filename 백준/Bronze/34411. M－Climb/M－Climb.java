import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        sb.append(m * n);

        System.out.print(sb);
    }
}