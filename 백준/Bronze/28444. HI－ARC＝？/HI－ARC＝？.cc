#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int H, I, A, R, C;
    cin >> H >> I >> A >> R >> C;

    int first = H * I;
    int second = A * R * C;
    int result = first - second;

    cout << result << endl;
}