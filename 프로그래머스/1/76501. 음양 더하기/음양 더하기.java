import java.util.Arrays;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] = absolutes[i] * -1;
            }
            answer += absolutes[i];
        }

        System.out.println(Arrays.toString(absolutes));
        System.out.println(answer);

        return answer;
    }
}