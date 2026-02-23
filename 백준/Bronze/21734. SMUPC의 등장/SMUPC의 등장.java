import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int ascii = (int) ch;

            int sum = 0;

            while (ascii > 0) {
                sum += ascii % 10;
                ascii /= 10;
            }

            for (int j = 0; j < sum; j++) {
                sb.append(ch);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}