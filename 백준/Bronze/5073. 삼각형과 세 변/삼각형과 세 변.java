import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] arr = new int[3];

            if (a == 0 && b == 0 && c == 0)
                break;

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr);

            if (arr[2] >= arr[0] + arr[1])
                sb.append("Invalid\n");
            else {
                if (arr[0] == arr[1] && arr[1] == arr[2])
                    sb.append("Equilateral\n");
                else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2])
                    sb.append("Scalene\n");
                else
                    sb.append("Isosceles\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}