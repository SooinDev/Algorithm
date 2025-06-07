import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
        }

        list.sort(Integer::compareTo);

        for (int i = 1; i <= 30; i++) {
            if (!list.contains(i)) {
                bw.write(i + "\n");
            }
        }
        bw.flush();

        br.close();
    }
}