#include <bits/stdc++.h>
using namespace std;

int countZero(int num) {
    if (num == 0)
        return 1;

    int cnt = 0;

    while (num > 0) {
        if (num % 10 == 0)
            cnt++;
        num /= 10;
    }

    return cnt;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        int n, m;
        cin >> n >> m;

        int ans = 0;

        for (int i = n; i <= m; i++) {
            ans += countZero(i);
        }

        cout << ans << '\n';
    }

    return 0;
}
