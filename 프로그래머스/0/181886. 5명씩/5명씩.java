import java.util.Arrays;

class Solution {
    public String[] solution(String[] names) {
        int answerLength = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        String[] answer = new String[answerLength];
        int index = 0;

        for (int i = 0; i < names.length; i += 5) {
            answer[index++] = names[i];
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}