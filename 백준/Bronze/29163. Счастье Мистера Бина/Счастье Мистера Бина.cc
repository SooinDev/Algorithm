#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int cnt1 = 0;
    int cnt2 = 0;

    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;

        if (num % 2 == 0)
            cnt1++;
        else
            cnt2++;
    }

    if (cnt1 > cnt2)
        cout << "Happy";
    else
        cout << "Sad";
}