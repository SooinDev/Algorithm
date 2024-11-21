import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String str = my_string.replaceAll("[^0-9]", "");
        System.out.println(str);

        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
            answer = answer + arr[i];
        }
        System.out.println(answer);

        return answer;
    }
}