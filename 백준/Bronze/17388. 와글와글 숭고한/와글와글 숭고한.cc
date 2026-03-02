#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); 

    int s, k, h;
    cin >> s >> k >> h;
    
    int minVal = min({s, k, h});

    if (s + k + h >= 100) {
        cout << "OK\n";
    } else {
        if (s == minVal) {
            cout << "Soongsil\n";
        } else if (k == minVal) {
            cout << "Korea\n";
        } else {
            cout << "Hanyang\n";
        }
    }

    
    return 0;
}