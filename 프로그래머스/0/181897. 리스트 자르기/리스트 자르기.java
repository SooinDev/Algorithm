import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1 -> {
                for (int i = 0; i <= b; i++) {
                    list.add(num_list[i]);
                }
            }
            case 2 -> {
                for (int i = a; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
            }
            case 3 -> {
                for (int i = a; i <= b; i++) {
                    list.add(num_list[i]);
                }
            }
            case 4 -> {
                for (int i = a; i <= b; i = i + c) {
                    list.add(num_list[i]);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Solution s = new Solution();

        int[] slicer = {1, 5, 2};

        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(s.solution(3, slicer, num_list)));

        bw.flush();
        bw.close();
    }
}