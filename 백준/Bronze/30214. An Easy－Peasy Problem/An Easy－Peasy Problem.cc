#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int s1, s2;
    cin >> s1 >> s2;
    double result = (double)s2 / 2;

    if (s1 >= result)
        cout << "E";
    else
        cout << "H";

    return 0;
}