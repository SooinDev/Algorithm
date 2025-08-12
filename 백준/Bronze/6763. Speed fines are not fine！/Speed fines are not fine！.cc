#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int limit;
    cin >> limit;

    int speed;
    cin >> speed;

    int gap = speed - limit;

    if (gap >= 1 && gap <= 20)
        cout << "You are speeding and your fine is $100.";
    else if (gap >= 21 && gap <= 30)
        cout << "You are speeding and your fine is $270.";
    else if (gap >= 31)
        cout << "You are speeding and your fine is $500.";
    else
        cout << "Congratulations, you are within the speed limit!";

    return 0;
}