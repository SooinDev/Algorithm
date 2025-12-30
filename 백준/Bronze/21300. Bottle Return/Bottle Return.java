import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int beer = Integer.parseInt(st.nextToken());
        int malt = Integer.parseInt(st.nextToken());
        int wineProducts = Integer.parseInt(st.nextToken());
        int carbonatedSoftDrinks = Integer.parseInt(st.nextToken());
        int seltzer = Integer.parseInt(st.nextToken());
        int water = Integer.parseInt(st.nextToken());

        int total = beer + malt + wineProducts + carbonatedSoftDrinks + seltzer + water;
        int result = total * 5;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}