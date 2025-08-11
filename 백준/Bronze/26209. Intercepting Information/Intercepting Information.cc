#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int arr[8];

    for (int i = 0; i < 8; i++) {
        cin >> arr[i];
    }

    bool flag = false;

    for (int i = 0; i < 8; i++) {
        if (arr[i] == 9) {
            flag = true;
            break;
        }
        else
            flag = false;
    }

    if (flag)
        cout << "F";
    else
        cout << "S";
}