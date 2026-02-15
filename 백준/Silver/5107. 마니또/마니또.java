import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            Map<String, String> map = new HashMap<>();
            List<String> visited = new ArrayList<>();

            List<String> names = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String u = st.nextToken();
                String v = st.nextToken();

                map.put(u, v);
                names.add(u);
            }

            int cycles = 0;

            for (String name : names) {
                if (visited.contains(name)) {
                    continue;
                }

                String current = name;

                while (!visited.contains(current)) {
                    visited.add(current);
                    current = map.get(current);
                }

                cycles++;
            }

            bw.write(caseNum + " " + cycles + "\n");
            caseNum++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}