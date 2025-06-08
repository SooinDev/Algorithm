import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            String str = Integer.toString(n);
            String reverseStr = new StringBuilder(str).reverse().toString();

            if (n == 0)
                break;

            if (str.equals(reverseStr))
                bw.write("yes\n");
            else
                bw.write("no\n");
        }

        bw.flush();
        bw.close();
    }
}