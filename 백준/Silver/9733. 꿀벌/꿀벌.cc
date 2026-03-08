#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string word;
    int total = 0;

    int reCount = 0;
    int ptCount = 0;
    int ccCount = 0;
    int eaCount = 0;
    int tbCount = 0;
    int cmCount = 0;
    int exCount = 0;

    while (cin >> word) {
        total++;

        if (word == "Re") reCount++;
        else if (word == "Pt") ptCount++;
        else if (word == "Cc") ccCount++;
        else if (word == "Ea") eaCount++;
        else if (word == "Tb") tbCount++;
        else if (word == "Cm") cmCount++;
        else if (word == "Ex") exCount++;
    }

    cout << fixed << setprecision(2);

    cout << "Re " << reCount << " " << (double)reCount / total << '\n';
    cout << "Pt " << ptCount << " " << (double)ptCount / total << '\n';
    cout << "Cc " << ccCount << " " << (double)ccCount / total << '\n';
    cout << "Ea " << eaCount << " " << (double)eaCount / total << '\n';
    cout << "Tb " << tbCount << " " << (double)tbCount / total << '\n';
    cout << "Cm " << cmCount << " " << (double)cmCount / total << '\n';
    cout << "Ex " << exCount << " " << (double)exCount / total << '\n';
    cout << "Total " << total << " 1.00\n";

    return 0;
}
