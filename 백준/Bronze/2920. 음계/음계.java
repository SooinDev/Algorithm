import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> ascending = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> descending = new ArrayList<>(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1));


        for (int i = 0; i < 8; i++) {
            int n = Integer.parseInt(st.nextToken());
            list.add(n);
        }

        if (list.equals(ascending))
            System.out.println("ascending");
        else if (list.equals(descending))
            System.out.println("descending");
        else
            System.out.println("mixed");

        br.close();
    }
}