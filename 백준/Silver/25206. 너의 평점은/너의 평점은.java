import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double sum = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String score2 = st.nextToken();
            double temp = 0;

            if (score2.equals("P"))
                continue;

            if (score2.equals("A+"))
                temp = 4.5;
            else if (score2.equals("A0"))
                temp = 4.0;
            else if (score2.equals("B+"))
                temp = 3.5;
            else if (score2.equals("B0"))
                temp = 3.0;
            else if (score2.equals("C+"))
                temp = 2.5;
            else if (score2.equals("C0"))
                temp = 2.0;
            else if (score2.equals("D+"))
                temp = 1.5;
            else if (score2.equals("D0"))
                temp = 1.0;
            else if (score2.equals("F"))
                temp = 0;

            sum += score * temp;
            scoreSum += score;
        }

        sb.append(sum / scoreSum);

        System.out.print(sb);
        br.close();
    }
}