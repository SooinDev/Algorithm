import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);      // str == 12345

        int[] answer  = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = Integer.parseInt(str.substring(answer.length - 1 - i, answer.length - i));
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}