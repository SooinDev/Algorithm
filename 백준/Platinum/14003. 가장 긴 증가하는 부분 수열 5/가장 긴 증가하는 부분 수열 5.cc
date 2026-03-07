#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> a(n);
    vector<int> lis;
    vector<int> pos(n);

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    for (int i = 0; i < n; i++) {
        auto it = lower_bound(lis.begin(), lis.end(), a[i]);

        int idx = it - lis.begin();

        if (it == lis.end()) {
            lis.push_back(a[i]);
        } else {
            *it = a[i];
        }

        pos[i] = idx;
    }

    int len = lis.size();

    cout << len << '\n';

    vector<int> ans(len);

    for (int i = n - 1; i >= 0; i--) {
        if (pos[i] == len - 1) {
            ans[len - 1] = a[i];
            len--;
        }
    }

    for (int x : ans) {
        cout << x << ' ';
    }

    return 0;
}
