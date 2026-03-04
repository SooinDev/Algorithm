import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            int k = Integer.parseInt(br.readLine());
            String[] arr = new String[k];
            boolean found = false;

            for (int j = 0; j < k; j++) {
                arr[j] = br.readLine();
            }

            for (int a = 0; a < k; a++) {
                for (int b = 0; b < k; b++) {

                    if (a == b)
                        continue;

                    String s = arr[a] + arr[b];

                    if (isPalindrome(s)) {
                        sb.append(s).append("\n");
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }

            if (!found)
                sb.append(0).append("\n");
        }

        System.out.print(sb);

        br.close();
    }

    static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }

        return true;
    }
}