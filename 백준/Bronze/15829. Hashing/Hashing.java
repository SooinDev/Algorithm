import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());

        String text = br.readLine();

        long result = 0;
        long pow = 1;
        int M = 1234567891;

        for (int i = 0; i < L; i++) {
            int a = text.charAt(i) - 'a' + 1;

            long term = (a * pow) % M;

            result = (result + term) % M;

            pow = (pow * 31) % M;
        }

        System.out.println(result);
        br.close();
    }
}