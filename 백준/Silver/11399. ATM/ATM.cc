#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    
    vector<int> vec;

    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        vec.push_back(num);
    }
    
    sort(vec.begin(), vec.end());

    int sum = 0;
    int time = 0;

    for (int i = 0; i < n; i++) {
        time += vec[i];
        sum += time;
    }

    cout << sum << '\n';
}
