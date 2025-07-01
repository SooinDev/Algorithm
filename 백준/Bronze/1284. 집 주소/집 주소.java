import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;

        while (true) {
            result = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1)
                    result += 2;
                else if (arr[i] == 0)
                    result += 4;
                else
                    result += 3;
            }

            result += arr.length + 1;
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}