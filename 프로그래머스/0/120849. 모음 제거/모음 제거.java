public class Solution {
    public String solution(String my_string) {

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == 'a') {
                my_string = my_string.replaceAll("a", "");
            }
            if (my_string.charAt(i) == 'e') {
                my_string = my_string.replaceAll("e", "");
            }
            if (my_string.charAt(i) == 'i') {
                my_string = my_string.replaceAll("i", "");
            }
            if (my_string.charAt(i) == 'o') {
                my_string = my_string.replaceAll("o", "");
            }
            if (my_string.charAt(i) == 'u') {
                my_string = my_string.replaceAll("u", "");
            }
        }
        
        
        return my_string;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String input = "bus";
        String result = sol.solution(input);

        System.out.println(result);
    }
}