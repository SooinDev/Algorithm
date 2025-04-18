import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        // 1. 수포자들의 패턴
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 2. 수포자들의 점수를 저장할 배열
        int[] scores = new int[3];

        // 3. 각 수포자의 패턴과 정답이 얼마나 일치하는지 확인
        for (int i = 0; i < answers.length; i++) { // 문제 번호 (0부터 시작)
            for (int j = 0; j < pattern.length; j++) { // 수포자 번호 (0: 1번 수포자, 1: 2번 수포자, 2: 3번 수포자)
                if (answers[i] == pattern[j][i % pattern[j].length]) { // 답 == 패턴이 반복될 때 현재 문제에 대응하는 패턴 내 위치
                    scores[j]++;
                }
            }
        }

        // 4. 가장 높은 점수 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // 5. 가장 높은 점수를 가진 수포자들의 번호를 찾아서 리스트에 담음
        ArrayList<Integer> answer =  new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        int[] returnAnswer = answer.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(returnAnswer));

        return returnAnswer;
    }
}