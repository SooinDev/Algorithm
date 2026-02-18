import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text1 = br.readLine();
        String text2 = br.readLine();
        String text3 = br.readLine();
        int temp = 0;
        String answer = "";

        if (isNumber(text1)) {
            temp = Integer.parseInt(text1) + 3;
        } else if (isNumber(text2)) {
            temp = Integer.parseInt(text2) + 2;
        } else if (isNumber(text3)) {
            temp = Integer.parseInt(text3) + 1;
        }

        if (temp % 3 == 0 && temp % 5 == 0)
            answer = "FizzBuzz";
        else if (temp % 3 == 0)
            answer = "Fizz";
        else if (temp % 5 == 0)
            answer = "Buzz";
        else
            answer = String.valueOf(temp);

        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumber(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}