#include <iostream>
#include <cmath>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin >> N;

    int result1 = 0;
    int result2;
    int result3 = 0;

    for (int i = 1; i <= N; i++) {
        result1 += i;
        result3 += pow(i, 3);
    }
    result2 = pow(result1, 2);

    cout << result1 << endl;
    cout << result2 << endl;
    cout << result3 << endl;

    return 0;
}