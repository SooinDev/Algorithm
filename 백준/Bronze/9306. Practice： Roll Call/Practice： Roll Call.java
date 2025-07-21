import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String name1 = br.readLine();
            String name2 = br.readLine();
            bw.write("Case " + i + ": " + name2 + ", " + name1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}