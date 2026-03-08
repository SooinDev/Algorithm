#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string str;
    cin >> str;

    int zero = 0;
    int one = 0;

    if (str[0] == '0')
        zero++;
    else
        one++;

    for (size_t i = 1; i < str.length(); i++) {
        if (str[i] != str[i - 1]) {
            if (str[i] == '0')
                zero++;
            else
                one++;
        }
    }

    cout << min(zero, one) << '\n';

    return 0;
}
