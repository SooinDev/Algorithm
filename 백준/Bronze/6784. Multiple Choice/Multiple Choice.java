import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        int result = 0;

        for (int i = 0; i < N; i++) {
            String C = br.readLine();
            list.add(C);
        }

        for (int i = 0; i < N; i++) {
            String C = br.readLine();
            list2.add(C);
        }

        for (int i = 0; i < N; i++) {
            if (list.get(i).equals(list2.get(i))) {
                result += 1;
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        br.close();
    }
}