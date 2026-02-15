import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        long a = n / 3;
        long b = (n - a) / 2;
        long c = n - a - b;

        long result = 1 + n + (a * b) + (b * c) + (c * a);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}