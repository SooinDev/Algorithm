import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] bugers = new int[3];
        int[] drinks = new int[2];

        for (int i = 0; i < 3; i++) {
            bugers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            drinks[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bugers);
        Arrays.sort(drinks);

        int bestPriceBuger = bugers[0];
        int bestPriceDrink = drinks[0];
        int price = bestPriceBuger + bestPriceDrink - 50;

        bw.write(String.valueOf(price));
        bw.flush();
        bw.close();
        br.close();
    }
}