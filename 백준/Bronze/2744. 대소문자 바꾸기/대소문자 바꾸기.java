import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String result = "";
        char b;
        for (int i = 0; i < word.length(); i++) {
            b = word.charAt(i);

            if (Character.isUpperCase(b))
                result += Character.toLowerCase(b);
            else
                result += Character.toUpperCase(b);
        }

        System.out.println(result);
    }
}