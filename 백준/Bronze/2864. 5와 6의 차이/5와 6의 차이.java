import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String a2 = a.replace('5', '6');
        String b2 = b.replace('5', '6');
        int max = Integer.parseInt(a2) + Integer.parseInt(b2);

        String a3 = a.replace('6', '5');
        String b3 = b.replace('6', '5');
        int min = Integer.parseInt(a3) + Integer.parseInt(b3);

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}