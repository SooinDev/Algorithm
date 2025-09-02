import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int[] nums = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            nums[i] = num.charAt(i) - '0';
        }

        if (nums[0] == 5 && nums[1] == 5 && nums[2] == 5)
            bw.write("YES");
        else
            bw.write("NO");

        bw.flush();
        bw.close();
    }
}