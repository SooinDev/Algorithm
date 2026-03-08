#include <bits/stdc++.h>
using namespace std;

vector<int> split(string input, char delimiter) {
    vector<int> answer;
    stringstream ss(input);
    string temp;
    while (getline(ss, temp, delimiter)) {
        answer.push_back(stoi(temp));
    }

    return answer;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n >> k;
    string s;
    cin >> s;
    vector<int> v = split(s, ',');

    while (k--) {
        vector<int> v2;
        for (size_t i = 0; i < v.size() - 1; i++) {
            v2.push_back(v[i + 1] - v[i]);
        }
        v = v2;
    }

    for (size_t i = 0; i < v.size(); i++) {
        cout << v[i];
        if (i != v.size() - 1) {
            cout << ",";
        }
    }

    return 0;
}
