#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    set<string, greater<string>> s;

    for (int i = 0; i < n; i++) {
        string name, status;
        cin >> name >> status;

        if (status == "enter") {
            s.insert(name);
        } else if (status == "leave") {
            s.erase(name);
        }
    }

    for (auto name : s) {
        cout << name << '\n';
    }

    return 0;
}