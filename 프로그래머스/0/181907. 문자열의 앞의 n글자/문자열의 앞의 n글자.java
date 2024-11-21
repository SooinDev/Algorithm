import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        answer = String.valueOf(result);
        System.out.println(answer);

        return answer;
    }
}