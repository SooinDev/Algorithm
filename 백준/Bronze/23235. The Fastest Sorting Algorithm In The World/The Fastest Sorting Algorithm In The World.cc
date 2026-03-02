#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int count = 0;

    while (true) {
        int n;
        cin >> n;

        if (n == 0) {
            break;
        }

        for (int i = 0; i < n; i++) {
            int num;
            cin >> num;
        }

        count++;    
    }

    for (int i = 1; i <= count; i++) {
        printf("Case %d: Sorting... done!\n", i);
    }

    return 0;
}