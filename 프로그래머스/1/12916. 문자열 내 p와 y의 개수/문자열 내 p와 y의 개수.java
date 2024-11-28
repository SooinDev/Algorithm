import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'p' || arr[i] == 'P') {
                ++pCount;
            }
            if (arr[i] == 'y' || arr[i] == 'Y') {
                ++yCount;
            }
        }
        
        if (pCount == yCount || (pCount == 0 && yCount == 0)) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}