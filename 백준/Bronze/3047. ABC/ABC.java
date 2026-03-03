import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // A < B < C

        String text = br.readLine();

        for (int i = 0; i < 3; i++) {
            char c = text.charAt(i);

            if (c == 'A') 
                sb.append(arr[0]).append(" ");
            else if (c == 'B')
                sb.append(arr[1]).append(" ");
            else
                sb.append(arr[2]).append(" ");
        }

        System.out.print(sb);
        br.close();
    }
}