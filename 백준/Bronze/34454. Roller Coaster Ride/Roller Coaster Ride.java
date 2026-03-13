import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        if (n <= c * p) {
            sb.append("yes");
        } else {
            sb.append("no");
        }

        System.out.println(sb);
        br.close();
    }
}