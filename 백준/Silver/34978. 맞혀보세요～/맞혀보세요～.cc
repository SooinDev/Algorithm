#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<set<char>> rule(26);

    for (int i = 0; i < n; i++) {
        char x;
        int m;

        cin >> x >> m;

        for (int j = 0; j < m; j++) {
            char y;
            cin >> y;

            rule[x - 'a'].insert(y);
        }
    }

    string s;
    cin >> s;

    for (int i = 0; i < (int)s.size(); i++) {
        char cur = s[i];

        if (rule[cur - 'a'].empty()) {
            continue;
        }

        if (i == (int)s.size() - 1) {
            continue;
        }

        char next = s[i + 1];

        if (rule[cur - 'a'].count(next) == 0) {
            cout << "no\n";
            return 0;
        }
    }

    cout << "yes\n";

    return 0;
}