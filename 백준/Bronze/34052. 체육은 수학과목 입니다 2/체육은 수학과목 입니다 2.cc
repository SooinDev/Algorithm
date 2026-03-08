#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int total = 0;

    for (int i = 0; i < 4; i++) {
        int num;
        cin >> num;
        total += num;
    }

    if (1800 - total < 300) {
        cout << "No\n";
    } else {
        cout << "Yes\n";
    }

    return 0;
}
