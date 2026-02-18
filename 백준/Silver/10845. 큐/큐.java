import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> queue = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
            } else if (cmd.equals("pop")) {
                if (queue.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(queue.remove(0) + "\n");
            } else if (cmd.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            } else if (cmd.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.get(0) + "\n");
                }
            } else if (cmd.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.get(queue.size() - 1) + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}