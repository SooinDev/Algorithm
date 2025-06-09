import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger total = new BigInteger(br.readLine());      // 총 사과 개수
        BigInteger difference = new BigInteger(br.readLine()); // 차이

        // Klaudia = (total + difference) / 2
        BigInteger klaudia = total.add(difference).divide(BigInteger.valueOf(2));
        // Natalia = (total - difference) / 2
        BigInteger natalia = total.subtract(difference).divide(BigInteger.valueOf(2));

        bw.write(klaudia + "\n");
        bw.write(natalia + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}