import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        char[] arr = text.toCharArray();
        String result = "";

        for (int i = arr.length - 1 ; i >= 0; i--) {
            result += arr[i];
        }

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}