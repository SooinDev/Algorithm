import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                dynamicArray.add(num);
            }
        }

        // ArrayList를 int[]로 변환
        int[] answer = dynamicArray.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
