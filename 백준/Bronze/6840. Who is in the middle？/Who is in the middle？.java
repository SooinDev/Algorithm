import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        int result = list.get(1);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}