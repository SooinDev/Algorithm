import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        // x = D / sqrt(H^2 + W^2)
        double ratio = Math.sqrt(H * H + W * W);
        double x = D / ratio;

        int height = (int)(H * x);
        int width = (int)(W * x);

        bw.write(height + " " + width);
        bw.flush();
        bw.close();
        br.close();
    }
}