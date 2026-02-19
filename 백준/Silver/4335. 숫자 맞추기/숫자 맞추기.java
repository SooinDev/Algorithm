import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = 1;
        int max = 10;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            String response = br.readLine();

            if (response.equals("too high")) {
                if (n - 1 < max)
                    max = n - 1;
            } else if (response.equals("too low")) {
                if (n + 1 > min)
                    min = n + 1;
            } else if (response.equals("right on")) {
                if (n >= min && n <= max)
                    bw.write("Stan may be honest\n");
                else
                    bw.write("Stan is dishonest\n");

                min = 1;
                max = 10;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}