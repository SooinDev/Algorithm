import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        // 듣도 못한 사람
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 보도 못한 사람
        for (int i = 0; i < m; i++) {
            String name = br.readLine();

            if (set.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        sb.append(result.size()).append("\n");

        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}