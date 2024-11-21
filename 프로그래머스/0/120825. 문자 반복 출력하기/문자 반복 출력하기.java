import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        char[] arr1 = my_string.toCharArray();
        char[] arr2 = new char[arr1.length * n];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i / n];
        }
        answer = new String(arr2);

        return answer;
    }
}