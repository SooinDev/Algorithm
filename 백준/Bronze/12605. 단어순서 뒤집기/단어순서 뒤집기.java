import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            String[] arr = text.split(" ");

            bw.write("Case #" + (i + 1) + ": ");

            for (int j = arr.length - 1; j >= 0; j--) {
                bw.write(arr[j] + " ");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}