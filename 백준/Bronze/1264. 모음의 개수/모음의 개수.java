import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        while (true) {
            String sentence = br.readLine();
            if (sentence.equals("#"))
                break;

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                switch (c) {
                    case 'a':
                        count++;
                        break;
                    case 'e':
                        count++;
                        break;
                    case 'i':
                        count++;
                        break;
                    case 'o':
                        count++;
                        break;
                    case 'u':
                        count++;
                        break;
                    case 'A':
                        count++;
                        break;
                    case 'E':
                        count++;
                        break;
                    case 'I':
                        count++;
                        break;
                    case 'O':
                        count++;
                        break;
                    case 'U':
                        count++;
                        break;
                }
            }
            bw.write(count + "\n");
            count = 0;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}