import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write("Gnomes:" + "\n");

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int[] arr = new int[3];
            arr[0] = x;
            arr[1] = y;
            arr[2] = z;

            if (arr[0] <= arr[1] && arr[1] <= arr[2])
                bw.write("Ordered" + "\n");
            else if (arr[0] >= arr[1] && arr[1] >= arr[2])
                bw.write("Ordered" + "\n");
            else
                bw.write("Unordered" + "\n");
        }
        br.close();
        bw.close();
    }
}