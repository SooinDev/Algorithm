import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatia.length; i++) {
            if (text.contains(croatia[i]))
                text = text.replace(croatia[i], "*");
        }

        bw.write(String.valueOf(text.length()));

        bw.flush();
        bw.close();
        br.close();
    }
}