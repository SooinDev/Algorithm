import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ten = N / 10;
        int one = N % 10;

        if (ten == one)
            bw.write("1");
        else
            bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }
}