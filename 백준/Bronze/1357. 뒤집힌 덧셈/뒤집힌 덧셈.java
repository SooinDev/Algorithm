import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        sb.append(rev(rev(x) + rev(y)));
        System.out.print(sb);
        br.close();
    }

    public static int rev(int n) {
        String temp = String.valueOf(n);
        String temp2 = "";
        String[] arr = temp.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            temp2 += String.valueOf(arr[i]);
        }

        int result = Integer.parseInt(temp2);
        return result;
    }
}