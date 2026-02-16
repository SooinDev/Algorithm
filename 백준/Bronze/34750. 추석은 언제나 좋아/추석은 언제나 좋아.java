import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int parent = 0;
        int me = 0;

        if (n >= 1000000)
            parent = (int) (n * 0.2);
        else if (n >= 500000)
            parent = (int) (n * 0.15);
        else if (n >= 100000)
            parent = (int) (n * 0.1);
        else
            parent = (int) (n * 0.05);

        me = n - parent;

        bw.write(parent + " " + me);

        bw.flush();
        bw.close();
        br.close();
    }
}