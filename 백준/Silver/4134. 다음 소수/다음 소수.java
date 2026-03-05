import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            long num = Long.parseLong(br.readLine());

            while (true) {

                if (isPrime(num)) {
                    sb.append(num).append("\n");
                    break;
                }

                num++;
            }
        }

        System.out.print(sb);
        br.close();
    }

    static boolean isPrime(long num) {

        if (num < 2)
            return false;

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}