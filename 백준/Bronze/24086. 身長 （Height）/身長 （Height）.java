import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int result = 0;

        if (a > b)
            result = a - b;
        else if (b > a)
            result = b - a;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}