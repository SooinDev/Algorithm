#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int count = 0;

  string mbti;
  cin >> mbti;

  int n;
  cin >> n;

  for (int i = 0; i < n; i++) {
    string text;
    cin >> text;

    if (text == mbti) {
      count++;
    }
  }

  cout << count << '\n';

  return 0;
}
