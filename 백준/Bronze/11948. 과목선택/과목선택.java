import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr1 = new int[4];
        int[] arr2 = new int[2];
        int total = 0;

        for (int i = 0; i < 4; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        total = arr1[1] + arr1[2] + arr1[3] + arr2[1];

        bw.write(total + "");

        bw.flush();
        br.close();
    }
}