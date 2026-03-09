#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string n;
    cin >> n;
    int value;

    stringstream ss;
    ss << hex << n;
    ss >> value;
    
    cout << value << '\n';

    return 0;
}