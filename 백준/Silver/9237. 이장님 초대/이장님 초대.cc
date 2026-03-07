#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> vec(n);

    for (int i = 0; i < n; i++)  {
        cin >> vec[i];
    }

    sort(vec.begin(), vec.end(), greater<int>());

    int answer = 0;

    for (int i = 0; i < n; i++) {
        answer = max(answer, i + 1 + vec[i]);
    }

    cout << answer + 1 << '\n';
}