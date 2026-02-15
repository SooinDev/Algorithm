import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xPoints[i] = Integer.parseInt(st.nextToken());
            yPoints[i] = Integer.parseInt(st.nextToken());
        }

        int ansX, ansY;

        if (xPoints[0] == xPoints[1])
            ansX = xPoints[2];
        else if (xPoints[0] == xPoints[2])
            ansX = xPoints[1];
        else
            ansX = xPoints[0];

        if (yPoints[0] == yPoints[1])
            ansY = yPoints[2];
        else if (yPoints[0] == yPoints[2])
            ansY = yPoints[1];
        else
            ansY = yPoints[0];

        bw.write(ansX + " " + ansY);

        bw.flush();
        bw.close();
        br.close();
    }
}