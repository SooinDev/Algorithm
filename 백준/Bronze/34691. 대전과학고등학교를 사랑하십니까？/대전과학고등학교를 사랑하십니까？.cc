#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    while (true) {
        string text;
        cin >> text;

        if (text == "end")
            break;

        if (text == "animal")
            cout << "Panthera tigris\n";
        else if (text == "tree")
            cout << "Pinus densiflora\n";
        else if (text == "flower")
            cout << "Forsythia koreana\n";
    }

    return 0;
}