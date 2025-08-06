#include <iostream>
using namespace std;

int main() {
    int N, M;
    int min;
    int answer;

    cin >> N >> M;

    if (N > M)
        min = M;
    else
        min = N;

    answer = min / 2;

    cout << answer;
}