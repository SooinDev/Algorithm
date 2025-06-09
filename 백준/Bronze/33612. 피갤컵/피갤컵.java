import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        if (N == 1)
            bw.write("2024 8");
        else if (N == 2)
            bw.write("2025 3");
        else if (N == 3)
            bw.write("2025 10");
        else if (N == 4)
            bw.write("2026 5");
        else
            bw.write("2026 12");

        bw.flush();
        bw.close();
        br.close();
    }
}