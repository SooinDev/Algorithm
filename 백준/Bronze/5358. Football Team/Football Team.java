import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name;
        while ((name = br.readLine()) != null) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (c == 'i')
                    c = 'e';
                else if (c == 'I')
                    c = 'E';
                else if (c == 'e')
                    c = 'i';
                else if (c == 'E')
                    c = 'I';
                result.append(c);
            }
            bw.write(result.toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}