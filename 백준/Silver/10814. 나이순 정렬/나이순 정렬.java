import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 나이, 이름, 가입순서를 모두 저장할 리스트
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age, name, i)); // 가입순서(i)도 함께 저장
        }

        // 나이 순으로 정렬하고, 나이가 같으면 가입순서로 정렬
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age == o2.age) {
                    return o1.order - o2.order; // 나이가 같으면 가입 순서로
                }
                return o1.age - o2.age; // 나이 오름차순
            }
        });

        // 결과 출력
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }

        br.close();
    }

    // 회원 정보를 담을 클래스
    static class Member {
        int age;
        String name;
        int order; // 가입 순서

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}