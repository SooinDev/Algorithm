#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n;
    int count = 0;
    
    for (int i = 1; i < n; i++) {
        for (int j = i; j < n; j++) {
            k = n - i - j;

            if (k >= i + j) {
                continue;
            } else {
                if (j > k) {
                    break;
                }
                count++;
            }
        }
    }

    cout << count << '\n';
}