#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;

    int aPerfomance = B / A;
    int bPerfomance = aPerfomance * 3;
    int result = C * bPerfomance;

    cout << result << endl;
}