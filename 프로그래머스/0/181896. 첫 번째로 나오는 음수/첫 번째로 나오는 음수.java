import java.util.*;

public class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {13, 22, 53, 24, 15, 6};
        System.out.println(sol.solution(arr));

        int[] arr2 = {13, -22, 53};
        System.out.println(sol.solution(arr2));
    }
}