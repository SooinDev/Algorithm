#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    vector<pair<int,int>> v;

    for (int i = 1; i <= 8; i++) {
        int score;
        cin >> score;
        v.push_back({score, i});
    }

    sort(v.begin(), v.end(), greater<>());

    int sum = 0;
    vector<int> ans;

    for (int i = 0; i < 5; i++) {
        sum += v[i].first;
        ans.push_back(v[i].second);
    }

    sort(ans.begin(), ans.end());

    cout << sum << '\n';

    for (int x : ans)
        cout << x << " ";
}