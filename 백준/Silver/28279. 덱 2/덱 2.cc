#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    deque<int> dq;

    for (int i = 0; i < n; i++) {
        int command;
        cin >> command;

        if (command == 1) {
            int num;
            cin >> num;
            dq.push_front(num);
        } else if (command == 2) {
            int num;
            cin >> num;
            dq.push_back(num);
        } else if (command == 3) {
            if (dq.empty()) {
                cout << -1 << '\n';
            } else {
                cout << dq.front() << '\n';
                dq.pop_front();
            }
        } else if (command == 4) {
            if (dq.empty()) {
                cout << -1 << '\n';
            } else {
                cout << dq.back() << '\n';
                dq.pop_back();
            }
        } else if (command == 5) {
            cout << dq.size() << '\n';
        } else if (command == 6) {
            if (dq.empty()) {
                cout << 1 << '\n';
            } else {
                cout << 0 << '\n';
            }
        } else if (command == 7) {
            if (dq.empty()) {
                cout << -1 << '\n';
            } else {
                cout << dq.front() << '\n';
            }
        } else if (command == 8) {
            if (dq.empty()) {
                cout << -1 << '\n';
            } else {
                cout << dq.back() << '\n';
            }
        }
    }

    return 0;
}