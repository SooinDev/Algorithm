import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = "" + n;
        int[] arr = new int[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(arr[i] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}