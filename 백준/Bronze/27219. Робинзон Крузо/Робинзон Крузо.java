import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int v = n / 5;
        int i = n % 5;
        String s = "";

        for (int j = 0; j < v; j++) {
            s += "V";
        }

        for (int j = 0; j < i; j++) {
            s += "I";
        }

        bw.write(s);

        bw.flush();
        bw.close();
        br.close();
    }
}