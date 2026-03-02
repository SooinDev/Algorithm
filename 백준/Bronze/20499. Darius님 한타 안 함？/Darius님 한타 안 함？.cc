#include <iostream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); 
    
    string kda;
    cin >> kda;

    istringstream ss (kda);
    string temp;
    vector<string> v;

    while (getline(ss, temp, '/')) {
        v.push_back(temp);
    }

    int k, d, a;

    k = stoi(v[0]);
    d = stoi(v[1]);
    a = stoi(v[2]);

    if (k + a < d || d == 0) {
        cout << "hasu\n";
    } else {
        cout << "gosu\n";
    }
    
    return 0;
}