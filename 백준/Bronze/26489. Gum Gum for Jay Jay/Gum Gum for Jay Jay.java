import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text1 = "gum gum for jay jay";
        int count = 0;

        while (true) {
            String sentence = br.readLine();
            if (sentence == null || sentence.length() == 0)
                break;

            if (sentence.equals(text1))
                count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}