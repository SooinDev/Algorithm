import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double bmi = weight / (height * height);

        if (bmi > 25)
            bw.write("Overweight");
        else if (bmi >= 18.5 && bmi <= 25)
            bw.write("Normal weight");
        else if (bmi < 18.5)
            bw.write("Underweight");

        bw.flush();
        br.close();
    }
}