import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = 0;
        if (b > n)
            max = b;
        else if (n > b)
            max = n;
        else
            max = n;

        if (a > max)
            sb.append("Subway");
        else if (a < max)
            sb.append("Bus");
        else
            sb.append("Anything");

        System.out.print(sb);
        br.close();
    }
}