import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();

        if (name.equals("NLCS"))
            bw.write("North London Collegiate School");
        else if (name.equals("BHA"))
            bw.write("Branksome Hall Asia");
        else if (name.equals("KIS"))
            bw.write("Korea International School");
        else if (name.equals("SJA"))
            bw.write("St. Johnsbury Academy");

        bw.flush();
        br.close();
    }
}