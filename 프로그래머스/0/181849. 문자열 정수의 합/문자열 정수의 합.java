
class Solution {
    public int solution(String num_str) {
        int answer = 0;

        int[] arr = new int[num_str.length()];

        for (int i = 0; i < num_str.length(); i++) {
            arr[i] = num_str.charAt(i) - '0';
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        System.out.println(answer);

        return answer;
    }
}