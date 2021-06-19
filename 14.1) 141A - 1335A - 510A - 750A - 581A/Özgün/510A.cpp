#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, m;
  bool isLeft = false;

  cin >> n >> m;

  for (int i = 0; i < n; ++i) {
    if (i % 2 == 0) {
      cout << string(m, '#') << endl;
    } else {
      if (isLeft) {
        cout << '#' + string(m - 1, '.') << endl;
        isLeft = false;
      } else {
        cout << string(m - 1, '.') + '#' << endl;
        isLeft = true;
      }
    }
  }

  return 0;
}