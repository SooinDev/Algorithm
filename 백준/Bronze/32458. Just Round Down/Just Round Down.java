import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double x = Double.parseDouble(br.readLine());
        int y = (int) x;
        bw.write(y + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}