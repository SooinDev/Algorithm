import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sleep = Integer.parseInt(br.readLine());
        int wakeup = Integer.parseInt(br.readLine());
        int result = 0;

        if (sleep >= 0 && sleep <=3)
            result = wakeup - sleep;
        else if (sleep >= 20 && sleep <=23)
            result = 24 - sleep + wakeup;

        sb.append(result);

        System.out.print(sb);
        br.close();
    }
}