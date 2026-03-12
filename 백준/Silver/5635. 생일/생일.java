import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String youngest = "";
        String oldest = "";

        int yYear = 0, yMonth = 0, yDay = 0;
        int oYear = 3000, oMonth = 13, oDay = 32;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (year > yYear ||
                    (year == yYear && month > yMonth) ||
                    (year == yYear && month == yMonth && day > yDay)) {
                yYear = year;
                yMonth = month;
                yDay = day;
                youngest = name;
            }

            if (year < oYear ||
                    (year == oYear && month < oMonth) ||
                    (year == oYear && month == oMonth && day < oDay)) {
                oYear = year;
                oMonth = month;
                oDay = day;
                oldest = name;
            }
        }

        System.out.println(youngest);
        System.out.println(oldest);
    }
}