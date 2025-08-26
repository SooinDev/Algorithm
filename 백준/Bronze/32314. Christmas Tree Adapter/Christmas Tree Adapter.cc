#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a, w, v;
    cin >> a;
    cin >> w >> v;

    if (w / v >= a)
        cout << 1 << endl;
    else
        cout << 0 << endl;

    return 0;
}