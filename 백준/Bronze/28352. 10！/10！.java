import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long fac = 1;

        for (int i = 1; i <= n; i++) {
            fac *= i;
        }

        long result = 0;
        result = fac / (7 * 24 * 60 * 60);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}