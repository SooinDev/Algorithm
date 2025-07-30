#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string text;
    cin >> text;

    for (int i = 0; i < text.size(); i++) {
        text[i] = toupper(text[i]);
    }

    cout << text << "\n";

    return 0;
}