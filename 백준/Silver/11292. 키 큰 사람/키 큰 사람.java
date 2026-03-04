import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            double max = 0;
            List<String> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                double height = Double.parseDouble(st.nextToken());

                if (height > max) {
                    max = height;
                    list.clear();
                    list.add(name);
                } else if (height == max) {
                    list.add(name);
                }
            }
            for (String name : list) {
                sb.append(name).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}