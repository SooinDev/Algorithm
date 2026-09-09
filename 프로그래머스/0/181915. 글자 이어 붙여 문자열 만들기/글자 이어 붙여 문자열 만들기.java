import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        ArrayList list = new ArrayList();

        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        
        return answer;
    }
}

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        
        System.out.println(s.solution("cvsgiorszzzmrpaqpe", arr));
    }
}