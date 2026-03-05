#include <bits/stdc++.h>
using namespace std;

bool vowel(char c){
    return c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u';
}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;

    while (cin >> s && s != "end"){

        bool ok = true, has = false;
        int v = 0, c = 0;

        for(int i = 0; i < s.size(); i++){

            if (vowel(s[i])){
                has = true;
                v++;
                c = 0;
            } else {
                c++;
                v = 0;
            }

            if (v == 3 || c == 3) {
                ok = false;
            }

            if (i && s[i] == s[i-1] && s[i] != 'e' && s[i] != 'o') {
                ok = false;
            }
        }

        cout << "<" << s << "> is " << (ok && has ? "acceptable" : "not acceptable") << ".\n";
    }
}