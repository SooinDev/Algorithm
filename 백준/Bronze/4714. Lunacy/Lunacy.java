import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            double X = Double.parseDouble(br.readLine());
            double Y = 0;

            if (X < 0)
                break;
            else {
                Y = X * 0.167;
                bw.write("Objects weighing " + String.format("%.2f", X) + " on Earth will weigh " + String.format("%.2f", Y) + " on the moon.\n");
            }
        }

        br.close();
        bw.close();
    }
}