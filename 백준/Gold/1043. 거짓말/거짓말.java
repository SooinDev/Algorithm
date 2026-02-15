import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        int truthCount = Integer.parseInt(st.nextToken());
        int[] truthPeople = new int[truthCount];

        for (int i = 0; i < truthCount; i++) {
            truthPeople[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer>[] parties = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            parties[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int partySize = Integer.parseInt(st.nextToken());

            if (partySize > 0) {
                int firstPerson = Integer.parseInt(st.nextToken());
                parties[i].add(firstPerson);

                for (int j = 1; j < partySize; j++) {
                    int nextPerson = Integer.parseInt(st.nextToken());
                    parties[i].add(nextPerson);
                    union(firstPerson, nextPerson);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            boolean canLie = true;

            for (int person : parties[i]) {
                for (int truth : truthPeople) {
                    if (find(person) == find(truth)) {
                        canLie = false;
                        break;
                    }
                }
                if (!canLie) break;
            }

            if (canLie) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }
}