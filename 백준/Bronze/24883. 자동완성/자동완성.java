import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char a = br.readLine().charAt(0);
        if (a == 'N' || a == 'n')
            bw.write("Naver D2");
        else
            bw.write("Naver Whale");

        bw.flush();
        bw.close();
        br.close();
    }
}