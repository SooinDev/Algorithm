import java.util.*;

public class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(24);
        System.out.println(Arrays.toString(result));
    }
}