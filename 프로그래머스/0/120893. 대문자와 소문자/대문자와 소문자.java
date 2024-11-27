class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            
            answer += ch;
        }

        System.out.println(answer);

        return answer;
    }
}