import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int reverseA = reverseInteger(a);
        int reverseB = reverseInteger(b);

        if (reverseA > reverseB)
            bw.write(String.valueOf(reverseA));
        else if (reverseA < reverseB)
            bw.write(String.valueOf(reverseB));

        bw.flush();
        bw.close();
    }

    public static int reverseInteger(int num) {
        String str = String.valueOf(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reversedStr);
    }
}