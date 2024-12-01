import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";

        // List 생성
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            list.add(currentCharacter); // List에 char 추가
        }

        // 초기 List
        System.out.println(list);

        // List 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());

        // 정렬된 List
        System.out.println(list);

        // List -> String 변환
        answer = list.stream().map(Object::toString).collect(Collectors.joining(""));

        System.out.println(answer);


        return answer;
    }
}