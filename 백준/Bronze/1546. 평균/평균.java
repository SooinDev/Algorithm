import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 사용자로부터 입력을 받기 위한 Scanner 객체를 생성
        int n = in.nextInt(); // 시험 본 과목의 개수
        int m = 0; // 과목의 최고점
        double sum = 0; // 과목의 합
        double avg = 0; // 평균
        ArrayList<Integer> list = new ArrayList<>(); // 과목들의 list

        for (int i = 0; i < n; i++) {
            int score = in.nextInt();

            list.add(score);

            m = Collections.max(list); // 과목의 최고점

        }

        for (int j = 0; j < list.size(); j++) {
            sum += (((double)list.get(j) / m) * 100);
        }

        avg = sum / n;

        System.out.println(avg);
    }
}