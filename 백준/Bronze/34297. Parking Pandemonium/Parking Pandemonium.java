import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        sb.append(m * c);

        System.out.print(sb);
    }

}