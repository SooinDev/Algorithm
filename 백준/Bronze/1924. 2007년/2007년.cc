#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int x, y;
    cin >> x >> y;

    // 각 월의 일수
    int days[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // 1월 1일부터 x월 y일까지의 총 일수 계산
    int total = 0;

    // 1월부터 (x-1)월까지의 일수를 모두 더함
    for (int i = 0; i < x - 1; i++) {
        total += days[i];
    }

    // y일을 더함 (단, 1월 1일을 기준점 0으로 하기 위해 y-1을 더함)
    total += (y - 1);

    // 요일 배열 (월요일부터 시작)
    string weekday[7] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    // 2007년 1월 1일이 월요일이므로
    cout << weekday[total % 7] << "\n";

    return 0;
}