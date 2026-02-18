import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String roomNumber = br.readLine();

        int[] count = new int[10];

        for (int i = 0; i < roomNumber.length(); i++) {
            int num = roomNumber.charAt(i) - '0';

            if (num == 9)
                num = 6;

            count[num]++;
        }

        count[6] = (count[6] + 1) / 2;

        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > max)
                max = count[i];
        }

        bw.write(String.valueOf(max));

        bw.flush();
        bw.close();
        br.close();
    }
}