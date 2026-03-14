import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) {
                break;
            }

            BigInteger n = new BigInteger(input);

            if (n.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
                sb.append("PREMIADO\n");
            } else {
                sb.append("TENTE NOVAMENTE\n");
            }
        }

        System.out.print(sb);
    }
}