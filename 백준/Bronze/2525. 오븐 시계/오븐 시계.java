import java.util.Scanner;

public class Main {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int times = scanner.nextInt();
        int answerHours = 0;
        int answerMinutes = 0;

        // 경우 1. 정각 이전일 때
        if (minutes + times < 60) {
            answerHours = hours;
            answerMinutes = minutes + times;
        }
        // 경우 2. 정각일 때
        else if ((minutes + times) % 60 == 0) {
            answerHours = hours + (minutes + times) / 60;
            answerMinutes = 0;
            if (answerHours == 24) {
                answerHours = 0;
            }
        }
        // 경우 3. 정각 이후일 때
        else if (minutes + times > 60) {
            answerHours = hours + (minutes + times) / 60;
            answerMinutes = (minutes + times) - ((minutes + times) / 60 * 60);
            if (answerHours >= 24) {
                answerHours = answerHours - 24;
            }
        }

        System.out.println(answerHours + " " + answerMinutes);
    }

    public static void main(String[] args) {
        solution();
    }
}