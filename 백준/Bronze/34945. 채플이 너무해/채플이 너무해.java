import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        if (x >= 6)
            bw.write("Success!");
        else
            bw.write("Oh My God!");

        bw.flush();
        bw.close();
        br.close();
    }
}