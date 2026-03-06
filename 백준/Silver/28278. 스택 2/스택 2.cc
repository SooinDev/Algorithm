#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    
    stack<int> stack;

    for (int i = 0; i < n; i++) {
        int command;
        cin >> command;

        if (command == 1) {
            int num;
            cin >> num;
            stack.push(num);
        } else if (command == 2) {
            if (stack.empty()) {
                cout << -1 << '\n';
            } else {
                cout << stack.top() << '\n';
                stack.pop();
            }
        } else if (command == 3) {
            cout << stack.size() << '\n';
        } else if (command == 4) {
            if (stack.empty()) {
                cout << 1 << '\n';
            } else {
                cout << 0 << '\n';
            }
        } else if (command == 5) {
            if (stack.empty()) {
                cout << -1 << '\n';
            } else {
                cout << stack.top() << '\n';
            }
        }
    }

    return 0;
}