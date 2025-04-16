import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0; // count
        int sidesMax = Arrays.stream(sides).max().getAsInt(); // sides[]에서 최댓값 구하기
        int sideMin = Arrays.stream(sides).min().getAsInt(); // sides[]에서 최솟값 구하기

        // 경우 1. sides[]에 가장 긴 변의 길이가 있을 때
        if (sides[0] < sides[1]) {
            for (int i = 1; i <= sides[1]; i++) {
                // 다른 두 변의 길이의 합 > sides[1]
                if (i + sides[0] > sides[1]) {
                    answer++;
                }
            }
        }
        else if (sides[0] > sides[1]) {
            for (int i = 1; i <= sides[0]; i++) {
                // 다른 두 변의 길이의 합 > sides[0]
                if (i + sides[1] > sides[0]) {
                    answer++;
                }
            }
        }

        // 경우 2. 나머지 한 변이 가장 긴 변일 때 (side[0] == side[1] 포함)
        for (int i = sidesMax + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }

        // 경우 3. 정삼각형일 때
        if (sidesMax == sides[0] && sidesMax == sides[1]) {
            answer++;
        }

        // 경우 4. sides[0] == sides[1], 그리고 나머지 한 변이 가장 짧은 변일 때
        if (sides[0] == sides[1]) {
            for (int i = 1; i < sideMin; i++) {
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
}