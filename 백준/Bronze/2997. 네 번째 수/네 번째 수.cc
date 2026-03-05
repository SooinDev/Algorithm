#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
    
    vector<int> vec;
    int gap1, gap2 = 0;
    int answer = 0;

    for (int i = 0; i < 3; i++) {
        int a;
        cin >> a;
        vec.push_back(a);
    }

    sort(vec.begin(), vec.end());

    gap1 = vec[1] - vec[0];
    gap2 = vec[2] - vec[1];

    if (gap1 == gap2) {
        answer = vec[2] + gap1;
    } else if (gap1 < gap2) {
        answer = vec[1] + gap1;
    } else if (gap2 < gap1) {
        answer = vec[0] + gap2;
    }

    cout << answer << "\n";

    return 0;
}