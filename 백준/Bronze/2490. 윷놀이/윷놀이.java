import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num == 0) {
                    count++;
                }
            }

            if (count == 1)
                bw.write("A" + "\n");
            else if (count == 2)
                bw.write("B" + "\n");
            else if (count == 3)
                bw.write("C" + "\n");
            else if (count == 4)
                bw.write("D" + "\n");
            else if (count == 0)
                bw.write("E" + "\n");

            count = 0;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}