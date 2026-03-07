#include <bits/stdc++.h>
using namespace std;

int n, m;
vector<int> arr;

void dfs(int depth) {

    if (depth == m) {
        for (int x : arr) {
            cout << x << " ";
        }
        cout << '\n';
        return;
    }

    for (int i = 1; i <= n; i++) {
        arr.push_back(i);
        dfs(depth + 1);
        arr.pop_back();
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    dfs(0);

    return 0;
}
