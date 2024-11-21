class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder builder = new StringBuilder(phone_number);
        char[] arr = phone_number.toCharArray();

        if (arr.length == 4) {
            answer = phone_number;
        }
        else {
            for (int i = 0; i < arr.length - 4; i++) {
                builder.setCharAt(i, '*');
                answer = builder.toString();
            }
        }
        
        System.out.println(answer);

        return answer;
    }
}