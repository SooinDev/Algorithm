#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;
    
    int stack[10000];  // 스택 배열
    int top = -1;      // 스택의 최상단 인덱스 (-1이면 빈 스택)
    
    for (int i = 0; i < n; i++) {
        string command;
        cin >> command;
        
        if (command == "push") {
            int x;
            cin >> x;
            stack[++top] = x;  // top을 증가시키고 값 저장
        }
        else if (command == "pop") {
            if (top == -1) {
                cout << -1 << "\n";
            } else {
                cout << stack[top--] << "\n";  // 값 출력 후 top 감소
            }
        }
        else if (command == "size") {
            cout << top + 1 << "\n";  // 스택 크기 = top + 1
        }
        else if (command == "empty") {
            if (top == -1) {
                cout << 1 << "\n";
            } else {
                cout << 0 << "\n";
            }
        }
        else if (command == "top") {
            if (top == -1) {
                cout << -1 << "\n";
            } else {
                cout << stack[top] << "\n";  // 최상단 값 출력 (제거하지 않음)
            }
        }
    }
    
    return 0;
}