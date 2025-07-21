import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int count1 = 0;
        int count2 = 0;

        if (A == 1) count1++;
        else count2++;

        if (B == 1) count1++;
        else count2++;

        if (C == 1) count1++;
        else count2++;

        if (count1 > count2)
            bw.write("1\n");
        else
            bw.write("2\n");

        bw.flush();
        br.close();
    }
}