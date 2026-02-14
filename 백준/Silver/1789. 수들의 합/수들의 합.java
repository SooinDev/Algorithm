import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());
        long sum = 0;
        long result = 0;

        for (long i = 1; i <= s; i++) {
            sum = sum + i;
            if (sum > s) {
                result = i - 1;
                break;
            } else if (sum == s) {
                result = i;
                break;
            }
                
        }
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}