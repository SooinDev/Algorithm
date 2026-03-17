import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();

        String[] arr = text.split(":");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int temp2 = test(n, m);

        sb.append(n / temp2).append(":").append(m / temp2);

        System.out.print(sb);
    }

    static int test(int num1, int num2) {

        int max = 0;

        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1%i==0 && num2%i==0) {
                max = i;
            }
        }
        return max;
    }
}