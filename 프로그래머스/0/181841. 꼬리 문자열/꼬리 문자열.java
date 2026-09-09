import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        
        return answer;
    }
}

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = {"abc", "def", "ghi"};
        String ex = "ef";
        
        System.out.println(s.solution(arr, ex));
    }
}