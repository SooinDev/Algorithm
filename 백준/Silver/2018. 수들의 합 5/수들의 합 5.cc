#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long n, start = 1, end = 1, sum = 1;
    int count = 0;
    cin >> n;

    while (end < n + 1) {
        if (sum < n) {
            end++;
            sum = sum + end;
        } else if (sum > n) {
            sum = sum - start;
            start++;
        } else if (sum == n) {
            count++;
            end++;
            sum = sum + end;
        }
    }
    
    cout << count << "\n";

    return 0;
}