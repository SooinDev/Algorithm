import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();

        for (int i = 0; i < text.length(); i += 10) {
            sb.append(text.substring(i, Math.min(i + 10, text.length())));
            sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}