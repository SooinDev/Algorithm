import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0)
                stack.pop();
            else
                stack.push(num);
        }

        for (int number : stack)
            result += number;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}