import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution {
    public int solution(int n, String control) {
        int answer = n;

        String[] arr = control.split("");

        for (String s : arr) {
            switch (s) {
                case "w" -> answer += 1;
                case "s" -> answer -= 1;
                case "d" -> answer += 10;
                case "a" -> answer -= 10;
            }
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Solution s = new Solution();

        System.out.println(s.solution(0, "wsdawsdassw"));

        bw.flush();
        bw.close();
    }
}