#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    int total = 900 + 60 + 600 + 170 + 160 + 110;
    int result = n / total;

    cout << result << '\n';

    return 0;
}
