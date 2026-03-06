#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int a;
  cin >> a;

  for (int i = 0; i < a; i++) {
    int t;
    int sum = 0;
    cin >> t;

    for (int j = 0; j < t; j++) {
      int num;
      cin >> num;
      sum += num;
    }
    cout << sum << '\n';
    sum = 0;
  }

  return 0;
}
