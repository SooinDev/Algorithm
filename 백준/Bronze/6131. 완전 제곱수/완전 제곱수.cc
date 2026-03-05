#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    int a = 0, b = 0;
    int count = 0;
    cin >> n;

    for (a = 1; a < 500; a++) {
        for (b = 1; b < 500; b++) {
            if (a * a == b * b + n) {
                count++;
            }
        }
    }
    
    cout << count << '\n';

    return 0;
}