import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0)
                zeroCount++;
            else if (num == 1)
                oneCount++;
        }

        if (zeroCount > oneCount)
            bw.write("Junhee is not cute!");
        else if (oneCount > zeroCount)
            bw.write("Junhee is cute!");

        bw.flush();
        bw.close();
        br.close();
    }
}