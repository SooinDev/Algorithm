import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>(); // 해시셋 생성

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}