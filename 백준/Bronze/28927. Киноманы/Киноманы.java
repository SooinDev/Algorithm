import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int sum1 = a1 * 3 + b1 * 20 + c1 * 120;

        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        int sum2 = a2 * 3 + b2 * 20 + c2 * 120;

        if (sum1 > sum2)
            sb.append("Max");
        else if (sum1 < sum2)
            sb.append("Mel");
        else
            sb.append("Draw");

        System.out.print(sb);
    }

}