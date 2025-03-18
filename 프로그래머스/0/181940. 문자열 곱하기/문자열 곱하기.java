import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String result = sol.solution("string", 3);

        System.out.println(result);
    }
}