import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
        }

        int max = Collections.max(list);
        System.out.println(max);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                idx = i + 1;
            }
        }

        System.out.println(idx);

        br.close();
    }
}