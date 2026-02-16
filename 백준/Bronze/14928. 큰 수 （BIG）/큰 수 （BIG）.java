import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int divisor = 20000303;

        long remainder = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            remainder = (remainder * 10 + digit) % divisor;
        }

        bw.write(String.valueOf(remainder));

        bw.flush();
        bw.close();
        br.close();
    }
}