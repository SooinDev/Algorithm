import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        Arrays.sort(arr);

        if (Math.pow(arr[0], 2) +  Math.pow(arr[1], 2) == Math.pow(arr[2], 2))
            result = 1;
        else if (arr[0] == arr[1] && arr[1] == arr[2])
            result = 2;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}