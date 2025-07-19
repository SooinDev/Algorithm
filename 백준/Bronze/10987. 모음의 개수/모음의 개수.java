import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        String[] arr = word.split("");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a"))
                count++;
            else if (arr[i].equals("e"))
                count++;
            else if (arr[i].equals("i"))
                count++;
            else if (arr[i].equals("o"))
                count++;
            else if (arr[i].equals("u"))
                count++;
        }
        bw.write(count + "\n");

        bw.flush();
        br.close();
    }
}